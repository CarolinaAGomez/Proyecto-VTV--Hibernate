package dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	
private static SessionFactory sessionFactory; /*Permite crear la conexion*/

	
	public static SessionFactory getSessionFactory() {
		try {
			if (sessionFactory == null) {
				
				StandardServiceRegistry standardRegistry = new 
						StandardServiceRegistryBuilder().configure("Hibernate.cfg.xml").build();
				
				Metadata metadata =new MetadataSources(standardRegistry).getMetadataBuilder().build();
				
				sessionFactory = metadata.getSessionFactoryBuilder().build();
			}
		}
			catch(HibernateException he) {
				System.err.println("EROR en la inicializacion de la SessionFactory: "+he);
				
				throw new ExceptionInInitializerError(he);
			}
			return sessionFactory;
		
	}

}
