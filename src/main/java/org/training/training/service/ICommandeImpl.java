package org.training.training.service;

import java.util.HashMap;
import java.util.Map;

import org.training.training.model.Article;
import org.training.training.model.Commande;

public class ICommandeImpl implements ICommande {
	
	private Commande commande;
	
	@Override
	public double calculeMontant() {
		double [] montant = {0};
		if (this.commande != null) {
			Map<Article, Integer> mapArticle = this.commande.getMapArticle();
			if (mapArticle != null) {
				
				// JAVA -8
				/*for (Map.Entry<Article, Integer> entry : mapArticle.entrySet()) {
				    System.out.println(entry.getKey() + " = " + entry.getValue());
				}*/
				// JAVA +8
				mapArticle.forEach((article, quantite) -> {
					montant[0] += article.getPrix()*quantite;
				});
			}		
		}
		return montant[0];
	}
	

	@Override
	public void ajouterArticle (Article article, int quantite) {
		boolean [] trouve = {false};
		if (this.commande == null)
			commande = new Commande();
		if (this.commande.getMapArticle() == null) {
			this.commande.setMapArticle(new HashMap<Article, Integer>());
			this.commande.getMapArticle().put(article, quantite);
		} else if (this.commande.getMapArticle() != null && this.commande.getMapArticle().size() == 0) {
			this.commande.getMapArticle().put(article, quantite);
		} else if (this.commande.getMapArticle() != null && this.commande.getMapArticle().size() > 0) {
			// TODO : a revoir
			
			this.commande.getMapArticle().forEach((art, qnt) -> {
				if (art.getCode().toLowerCase().equals(article.getCode().toLowerCase())) {
					this.commande.getMapArticle().put(art, qnt+quantite);
					if (!trouve[0]) {
						trouve[0] = true;
					}
				}
			});
			
			if (!trouve[0]) {
				this.commande.getMapArticle().put(article, quantite);
			}
		}
	}
	
	@Override
	public void showCommande() {
		System.out.println("show commande");
	//	System.out.println(this.commande.toString());
	}
//
//	@Override
//	public Commande supprimerArticle(Article article) {
//		// TODO Auto-generated method stub
//		return new Commande();
//	}
//
//	@Override
//	public Commande modifierCommande(Commande commande) {
//		return new Commande();
//	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	
}
