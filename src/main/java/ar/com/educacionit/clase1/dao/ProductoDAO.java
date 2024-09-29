package ar.com.educacionit.clase1.dao;


import org.hibernate.Session;
import org.hibernate.Transaction;

import ar.com.educacionit.clase1.model.Producto;
import ar.com.educacionit.clase1.util.HibernateUtil;

public class ProductoDAO {

    public void guardarProducto(Producto producto) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.save(producto);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
