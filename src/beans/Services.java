package beans;

import java.util.List;

import org.hibernate.Session;

import util.HibernateUtil;

public class Services {
	
	
	public void addProduit(Produit p){
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
	}
	
	
	
	public Produit getProduitById(Long idP){
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Produit p=(Produit) session.load(Produit.class, idP);
		return p;
	}
	
	
	
	public List<Produit> getAllProduit(){
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return session.createQuery("from Produit").list();
	}
	
	public void deleteProduit(Long idP){
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Produit p=getProduitById(idP);
		if(p!=null){
			session.delete(p);
			session.getTransaction().commit();
		}
	}
	
	
	
	
	
}
