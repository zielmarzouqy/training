package org.training.training.model;

import java.util.Map;

public class Commande {
	private String num;
	private String date;
	private Client client;
	private Map<Article, Integer> mapArticle;
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Map<Article, Integer> getMapArticle() {
		return mapArticle;
	}
	public void setMapArticle(Map<Article, Integer> mapArticle) {
		this.mapArticle = mapArticle;
	}
	@Override
	public String toString() {
		return "Commande [num=" + num + ", date=" + date + ", client=" + client + ", mapArticle=" + mapArticle + "]";
	}
	
	
	
}
