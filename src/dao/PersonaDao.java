package dao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Automotor;
import datos.Contribuyente;
import datos.Inspeccion;
import datos.Inspector;
import datos.Persona;

public class PersonaDao {

	
	private static Session session;
	private Transaction tx;
	
	private void iniciaOperacion() throws HibernateException{
		session= HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}
	
	private void manejaExcepcion(HibernateException he) throws HibernateException{
		
		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso de datos" , he);
	}
	
	

	
// 1 traerContribuyente (int idPersona) : Contribuyente
	
	
	public Persona traerPersona(int idPersona) {
		Persona p ;
		try {
			iniciaOperacion();
		p= session.get(Persona.class, idPersona);
		tx.commit();
		}finally {
			session.close();
		}
		return p;
	}
	
	public Contribuyente traerContribuyente(int idPersona) {
		Contribuyente p ;
		try {
			iniciaOperacion();
		//p= session.get(Contribuyente.class, idPersona);
			p=  (Contribuyente) session.createQuery("from Contribuyente c where c.idPersona="+idPersona).uniqueResult();
		Hibernate.initialize(p.getListaAutomotor());
		tx.commit();
		}finally {
			session.close();
		}
		return p;
	}
	
	
	
	//2) + traerInspector (int idPersona) : Inspector
	
	public Inspector traerInspector(int idPersona) {
		Inspector p ;
		try {
			iniciaOperacion();
		p= session.get(Inspector.class, idPersona);
		Hibernate.initialize(p.getListaI());
		tx.commit();
		}finally {
			session.close();
		}
		return p;
	}
	
	
	//3) + traerAutomotor (String dominio) : Automotor
	public Automotor traerAutomotorr(String dominio) {
		Automotor p ;
		try {
			iniciaOperacion();
			String hql ="from Automotor e where e.dominio='"+ dominio +"'";
		p= (Automotor) session.createQuery(hql).uniqueResult();
		Hibernate.initialize(p.getListaInspeccion());
		tx.commit();
		}finally {
			session.close();
		}
		return p;
	}
	
	
	
	//4) + traerInspeccion (int idInspeccion) : Inspeccion
	public Inspeccion traerInspeccion(int idInspeccion) {
		Inspeccion p ;
		try {
			iniciaOperacion();
		p=(Inspeccion) session.get(Inspeccion.class, idInspeccion);
		tx.commit();
		}finally {
			session.close();
		}
		return p;
	}
	
	public Inspeccion traerInspeccion1(int idInspeccion) {
		Inspeccion p ;
		try {
			iniciaOperacion();
		p= (Inspeccion) session.createQuery("from Inspeccion i where i.idInspeccion="+idInspeccion).uniqueResult();
		
		tx.commit();
		}finally {
			session.close();
		}
		return p;
	}
	
	
	
	
	public Automotor traeauto(int id) {
		Automotor p ;
		try {
			iniciaOperacion();
		p=(Automotor) session.createQuery("from Automotor i where i.idAutomotor="+id).uniqueResult();
		tx.commit();
		}finally {
			session.close();
		}
		return p;
	}
	
	
	
	
	
	
	//5) + traerInspeccion (Automotor automotor) : Inspeccion
	// un auto tiene una lista de inspeccion y  trae lista inspeccion
	
		@SuppressWarnings("unchecked")
		public List<Inspeccion> traerInspeccion(Automotor automotor) {
			List<Inspeccion> p =null;
		try {
			iniciaOperacion();
		p= session.createQuery("from Inspeccion i inner join fetch i.auto a where a.idAutomotor ="+automotor.getIdAutomotor()).list();
		//Hibernate.initialize(automotor.getListaInspeccion());
		
		tx.commit();
		}finally {
			session.close();
		}
		return p;
	}
		
		
	
		
	
	//6) + traerInspeccion (LocalDate fecha) : Inspeccion
	
	@SuppressWarnings("unchecked")
	public List<Inspeccion> traerInspeccion(LocalDate fecha) {
		List<Inspeccion> p= null ;
		try {
			
			iniciaOperacion();
			String hql = "from Inspeccion i where i.fecha='" + fecha +"'";
		p=  session.createQuery(hql).list();
		tx.commit();
		}finally {
			session.close();
		}
		return p;
	}
	
	//7) + traerInspeccion (Inspector inspector, LocalDate fecha) : Inspeccion
	
	
	//
	@SuppressWarnings("unchecked")
	public List<Inspeccion>  traerInspeccion(Inspector inspector, LocalDate fecha) {
		List<Inspeccion> p ;
		
	try {
		iniciaOperacion();
	p=   session.createQuery("from Inspeccion i inner join fetch i.inspector r where r.idPersona="+inspector.getIdPersona()+"and i.fecha='"+fecha+"'").list();
	tx.commit();
	}finally {
		session.close();
	}
	return p;
	}


	//8) + traerInspeccion (LocalDate fecha, String estado) : Inspeccion
	@SuppressWarnings("unchecked")
	public List<Inspeccion>  traerInspeccion(LocalDate fecha, String estado) {
		List<Inspeccion> p ;
		//DateTimeFormatter f=DateTimeFormatter.ofPattern("yyyy-dd-MM");
	try {
		iniciaOperacion();
	p=   session.createQuery("from Inspeccion i  where i.estadoInspeccion ='"+estado+"'"+"and i.fecha='"+fecha+"'").list();
	tx.commit();
	}finally {
		session.close();
	}
	return p;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Persona> traerContr (){
		List<Persona> traer=null;
		try {
			iniciaOperacion();
			traer = session.createQuery("from Contribuyente").list();
			tx.commit();
		}finally {
			session.close();
		}
	return traer;
}
	
	
	@SuppressWarnings("unchecked")
	public List<Contribuyente> traerContri (){
		List<Contribuyente> traer=null;
		try {
			iniciaOperacion();
			traer = session.createQuery("from Contribuyente").list();
			tx.commit();
		}finally {
			session.close();
		}
	return traer;
}
	
}
