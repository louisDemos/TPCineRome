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

	public void ajouter(Article article, int qte) {
		LignePanier lignepanier = new LignePanier(article, qte);
		contenu.add(lignepanier);

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
		String description = "";
		for (LignePanier lp : contenu) {
			description += lp.getArticle().getReference() + "" + lp.getQteCommande() + "\n";
		}

		return description;
	}
}
