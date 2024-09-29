package ar.com.educacionit.clase1.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	 private static SessionFactory sessionFactory;

	    static {
	        try {
	            sessionFactory = new Configuration().configure().buildSessionFactory();
	        } catch (Throwable ex) {
	            throw new ExceptionInInitializerError(ex);
	        }
	    }
	    
	    public static void shutdown() {
	        // Cerrar caches y conexiones
	        getSessionFactory().close();
	    }

		public static SessionFactory getSessionFactory() {
	        return sessionFactory;

		}

}
