package Controlador;

import Modelo.PagosDosDAO;
import Modelo.PagosUnoDAO;
import Modelo.RecargasDAO;
import Modelo.Validaciones;
import POJOS.PagoDos;
import POJOS.PagoUno;
import POJOS.Recargas;
import com.epagoinc.client.ApiClient;
import com.epagoinc.clientswitchaccountbalanceservice.AccountBalanceQueryResponse;
import com.epagoinc.clientswitchtransactionservicev2.ApplyTransactionResponse;
import java.io.IOException;
import java.math.BigDecimal;

public class Controller {

    private Recargas r;
    private PagoUno pu;
    private PagoDos pd;
    private ApiClient client;

    public Controller() {
    }

    public Controller(Recargas recarga, String Id) {
        r = recarga;
        client = new ApiClient(Id);
    }

    public Controller(PagoUno pagoUno, String Id) {
        pu = pagoUno;
        client = new ApiClient(Id);
    }

    public Controller(PagoDos pagoDos, String Id) {
        pd = pagoDos;
        client = new ApiClient(Id);
    }

    public ApplyTransactionResponse Recarga() throws IOException {
        System.out.println(r.getPhone().substring(0, r.getPhone().length()));
        System.out.println(r.getTerminal().substring(0, r.getTerminal().length()));
        
        Validaciones validar = new Validaciones();
        if (validar.VerificarNumero(r.getPhone()) && validar.VerificarTerminal(r.getTerminal())) {
            return NuevaRecarga(r);
        } else {
            return null;
        }

    }

    public ApplyTransactionResponse PagoUno() {

        Validaciones validar = new Validaciones();
        
       
        if (validar.VerificarTerminal(pu.getTerminal())) {
            return NuevoPagoUno(pu);
        } else {
            return null;
        }

    }

    public ApplyTransactionResponse PagoDos() {

        Validaciones validar = new Validaciones();
        if (validar.VerificarTerminal(pd.getTerminal())) {
            return NuevoPagoDos(pd);
        } else {
            return null;
        }

    }

    public AccountBalanceQueryResponse Consulta(String Terminal, String ConceptCode, String Account) {
        Validaciones validar = new Validaciones();
        
        if (validar.VerificarTerminal(Terminal)) {
            return ConsultarSaldo(Terminal, ConceptCode, Account);
        } else {
            return null;
        }

    }

    private ApplyTransactionResponse NuevaRecarga(Recargas recarga) throws IOException {

        //---Declaración de variables
        String mensaje = null;
        int Folio = 0; //variable de almacenamiendo de folio de transaccion
        ApplyTransactionResponse t = null; //declaracion del objeto para realizar la transaccion
        //---
        //---Parseo de variables
        BigDecimal subTotalAmount = new BigDecimal(recarga.getSubtotalAmount());
        String conceptCode = recarga.getConceptCode();
        String account = recarga.getPhone();
        //---

        //---Almacenamiento en BD
        try {
            RecargasDAO RDAO = new RecargasDAO(); //Creamos objeto tipo recarga con los datos del WS
            Folio = Integer.valueOf(RDAO.IngresarRecarga(recarga)); //Almacenamos la recarga y solicitamos el folio
        } catch (Exception e0) {
            mensaje = "Error de almacenamiento";
        }
        //---

        //---Ejecutamos la transacción
        try {
            t = client.executeTransaction(conceptCode, account, subTotalAmount, null); //Realizamos la transacción

            //---Realizamos la actualización del folio y el estatus
            RecargasDAO RDAO = new RecargasDAO();
            try {
                if (t.getStatusCode() == 0) {
                    RDAO.Actualizar(recarga, Folio, t.getEPagoTransactionId(), "Exito");
                    mensaje = "Folio: " + t.getEPagoTransactionId() + "  Estatus: " + t.getStatusCode();
                } else {
                    RDAO.Actualizar(recarga, Folio, t.getEPagoTransactionId(), "Error: " + t.getStatusCode());
                    mensaje = "Folio: " + "Error" + "  Estatus: " + t.getStatusCode();
                }

            } catch (Exception e4) {
                e4.printStackTrace();
            }
            //---

        } catch (Exception e2) {
            e2.printStackTrace();
            mensaje = "Error de transacción";
        }
        //---

        return t;
    }

    private ApplyTransactionResponse NuevoPagoUno(PagoUno pagouno) {

        //Declaración de variables
        String mensaje;
        int Folio = 0;
        ApplyTransactionResponse t = null;
        BigDecimal subTotalAmount = new BigDecimal(pagouno.getSubtotalAmount());
        String conceptCode = pagouno.getConceptCode();
        String account = pagouno.getAccount();

        try {
            //Creamos objeto tipo recarga con los datos del WS
            PagosUnoDAO PuDAO = new PagosUnoDAO();
            Folio = Integer.valueOf(PuDAO.IngresarPagoUno(pagouno));
        } catch (Exception e0) {
            mensaje = "Error de almacenamiento";
        }

        try {
            //Realizamos la transacción

            t = client.executeTransaction(conceptCode, account, subTotalAmount, null);

            //Realizamos la actualización del folio y el estatus
            PagosUnoDAO PuDAO = new PagosUnoDAO();
            if (t.getStatusCode() == 0) {
                PuDAO.Actualizar(pagouno, Folio, t.getClientSwitchTransactionId(), "Exito");
            } else {
                PuDAO.Actualizar(pagouno, Folio, t.getClientSwitchTransactionId(), "Error: " + t.getStatusCode());
            }

            mensaje = "Folio: " + t.getClientSwitchTransactionId() + "  Estatus" + t.getStatusCode();

        } catch (Exception e2) {
            mensaje = "Error de transacción";
        }

        return t;

    }

    private ApplyTransactionResponse NuevoPagoDos(PagoDos pagodos) {

        //Declaración de variables
        String mensaje;
        int Folio = 0;
        ApplyTransactionResponse t = null;
        BigDecimal subTotalAmount = new BigDecimal(pagodos.getSubtotalAmount());
        String conceptCode = pagodos.getConceptCode();
        String account = pagodos.getAccount();
        String DV = pagodos.getDv();
        try {
            //Creamos objeto tipo recarga con los datos del WS

            PagosDosDAO PdDAO = new PagosDosDAO();
            Folio = Integer.valueOf(PdDAO.IngresarPagoDos(pagodos));
        } catch (Exception e0) {
            mensaje = "Error de almacenamiento";
        }

        try {
            //Realizamos la transacción

            t = client.executeTransaction(conceptCode, account, subTotalAmount, DV);

            //Realizamos la actualización del folio y el estatus
            PagosDosDAO PdDAO = new PagosDosDAO();
            if (t.getStatusCode() == 0) {
                PdDAO.Actualizar(pagodos, Folio, t.getClientSwitchTransactionId(), "Exito");
            } else {
                PdDAO.Actualizar(pagodos, Folio, t.getClientSwitchTransactionId(), "Error: " + t.getStatusCode());
            }

            mensaje = "Folio: " + t.getClientSwitchTransactionId() + "  Estatus" + t.getStatusCode();

        } catch (Exception e2) {
            mensaje = "Error de transacción";
        }

        return t;

    }

    private AccountBalanceQueryResponse ConsultarSaldo(String Terminal, String ConceptCode, String Account) 
    {
        System.out.println("Final: "+ConceptCode +" - "+ Account);
        ApiClient clientA = new ApiClient(Terminal);
        return clientA.executeAccountBalanceQuery(ConceptCode, Account);
    }

}
