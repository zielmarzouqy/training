package org.training.training.service;

import org.springframework.stereotype.Service;
import org.training.training.model.Article;


public interface ICommande {
	double calculeMontant();
//	Commande ajouterArticle(Article article);
//	Commande supprimerArticle(Article article);
//	Commande modifierCommande(Commande commande);
	void ajouterArticle(Article article, int quantite);
	String showCommande();
}