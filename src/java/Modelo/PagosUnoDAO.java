package Modelo;

import POJOS.PagoUno;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class PagosUnoDAO {
    SessionFactory sf=null;
    Session sesion= null;
    Transaction tx=null;
    //Metodo para almacenar los datos
    public String IngresarPagoUno(PagoUno pu)
    {
        String x;
        try
        {
            sf= HibernateUtil.getSessionFactory();
            sesion=sf.openSession();
            tx=sesion.beginTransaction();
            sesion.save(pu);
            x=String.valueOf(pu.getId());
            tx.commit();
            sesion.close();
        }
        catch(Exception ex)
        {
            tx.rollback();
            
            throw new RuntimeException("No se realizó el pago");
        }
        return x;
        
    }
    
    public void Actualizar(PagoUno r,int id,String Folio,String Estatus)
    {
        try
        {
            
            
            r.setId(id);
            r.setFolio(Folio);
            r.setEstatus(Estatus);
            
            sf= HibernateUtil.getSessionFactory();
            sesion=sf.openSession();
            sesion.beginTransaction();
            sesion.update(r);
            sesion.getTransaction().commit();
            sesion.close();
            
        }
        catch(Exception ex)
        {
            tx.rollback();
            
            throw new RuntimeException("No se realizó la actualización");
        }
    }
    
    
    
}
