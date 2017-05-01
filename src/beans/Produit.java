package beans;

import java.util.HashSet;
import java.util.Set;

public class Produit {
	private Long idProduit;
	private String nom;
	private String libelle;
	private Double prix;
	private Set<Categorie> categories = new HashSet<Categorie>();
	
	
	
	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public Set<Categorie> getCategories() {
		return categories;
	}
	public void setCategories(Set<Categorie> categories) {
		this.categories = categories;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(String nom, String libelle, Double prix) {
		super();
		this.nom = nom;
		this.libelle = libelle;
		this.prix = prix;
	}
	
	public void show(){
		System.out.println(this.nom + " - " + this.libelle + " - " + this.prix.toString());
	}
	
	
}
