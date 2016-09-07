package Modelo;

import POJOS.PagoDos;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class PagosDosDAO {
    SessionFactory sf=null;
    Session sesion= null;
    Transaction tx=null;
    //Metodo para almacenar los datos
    public String IngresarPagoDos(PagoDos pd)
    {
        String x;
        
        try
        {
            sf= HibernateUtil.getSessionFactory();
            sesion=sf.openSession();
            tx=sesion.beginTransaction();
            sesion.save(pd);
            x=String.valueOf(pd.getId());
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
    
    public void Actualizar(PagoDos r,int id,String Folio,String Estatus)
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
