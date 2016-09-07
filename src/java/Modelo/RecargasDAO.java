package Modelo;

import POJOS.Recargas;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class RecargasDAO {
    SessionFactory sf=null;
    Session sesion= null;
    Transaction tx=null;
    
    //Crear
    public String IngresarRecarga(Recargas r)
    {
        String x;
        try
        {
            sf= HibernateUtil.getSessionFactory();
            sesion=sf.openSession();
            tx=sesion.beginTransaction();
            sesion.save(r);
            
            x=String.valueOf(r.getId());
            
            tx.commit();
            sesion.close();
        }
        catch(Exception ex)
        {
            tx.rollback();
            
            throw new RuntimeException("No se realizó la recarga");
        }
        return x;
        
    }
    
    //Update
     
     public void Actualizar(Recargas r,int id,String Folio,String Estatus)
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
