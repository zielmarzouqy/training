package org.training.training.model;

import java.util.List;

public class Article {
	private String code;
	private String designation;
	private double prix;
	private List<Commande> listCommande;

	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Article(String code, String designation, double prix) {
		super();
		this.code = code;
		this.designation = designation;
		this.prix = prix;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public List<Commande> getListCommande() {
		return listCommande;
	}
	public void setListCommande(List<Commande> listCommande) {
		this.listCommande = listCommande;
	}
	@Override
	public String toString() {
		return "Article [code=" + code + ", designation=" + designation + ", prix=" + prix + "]";
	}
	
	
}
