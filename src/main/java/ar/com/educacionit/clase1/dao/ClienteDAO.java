package ar.com.educacionit.clase1.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import ar.com.educacionit.clase1.model.Cliente;
import ar.com.educacionit.clase1.util.HibernateUtil;

public class ClienteDAO {

	public void guardarCliente(Cliente cliente) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.save(cliente);
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
	
	public Cliente obtenerClientePorId(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Cliente cliente = session.get(Cliente.class, id);
        session.close();
        return cliente;
    }
	
}
