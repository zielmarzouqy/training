package org.training.training.model;

import java.util.List;

public class Client {
	
	private String nom;
	private String prenom;
	private String adresse;
	private String telephone;
	
	private List<Commande> listCommande;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public List<Commande> getListCommande() {
		return listCommande;
	}
	public void setListCommande(List<Commande> listCommande) {
		this.listCommande = listCommande;
	}
	
}