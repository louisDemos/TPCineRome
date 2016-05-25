package com.demos.cinerome.model;

import java.util.ArrayList;

public class Panier {

	private ArrayList<LignePanier> contenu = new ArrayList<LignePanier>();

	public ArrayList<LignePanier> getContenu() {
		return contenu;
	}

	public Panier() {
		super();

	}

	public void ajouterArticle(Article article, int qteCommande) {
		LignePanier lignepanier = new LignePanier(article, qteCommande);
		contenu.add(lignepanier);
	}

	public void retirerArticle(String reference) {
		for (LignePanier lignepanier : contenu) {
			if (lignepanier.getArticle().getReference().equals(reference))
				contenu.remove(lignepanier);
		}
	}

	public void modifierQteArticle(String reference, int qte) {
		for (LignePanier lignepanier : contenu) {
			if (lignepanier.getArticle().getReference().equals(reference))
				lignepanier.setQteCommande(qte);
		}
	}

	public double getPrixTotalHT() {

		double prix = 0;
		for (LignePanier lignepanier : contenu) {
			prix += lignepanier.getArticle().getPrixHT() * lignepanier.getQteCommande();
		}
		return prix;
	}

	@Override
	public String toString() {
		return "Panier [contenu=" + contenu + "]";
	}

	

}
