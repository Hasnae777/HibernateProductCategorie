import java.util.Iterator;

import beans.Produit;
import beans.Services;

public class Test {

	public static void main(String[] args) {
		// load sevices
		Services s= new Services();
		
		// les produits
		Produit p1 = new Produit("PC1", "Description1", (double) 7000);
		Produit p2 = new Produit("PC2", "Description2", (double) 5000);
		Produit p3 = new Produit("PC3", "Description3", (double) 6000);
		Produit p4 = new Produit("PC4", "Description4", (double) 11000);

		s.addProduit(p1);
		s.addProduit(p2);
		s.addProduit(p3);
		s.addProduit(p4);
		
		Produit p= s.getProduitById(1L);
		p.show();
		 
		System.out.println("les produits qui existent");
		
		Iterator<Produit> iterator= s.getAllProduit().iterator();
		while(iterator.hasNext()){
			Produit produit=iterator.next();
			produit.show();
		}
		
		
		System.out.println("supprimer produit 1");
		s.deleteProduit(1L);
		
		 
		System.out.println("les produits qui restent");
		
		Iterator<Produit> iterator1= s.getAllProduit().iterator();
		while(iterator1.hasNext()){
			Produit produit1=iterator1.next();
			produit1.show();
		}
			
	}
	
}
