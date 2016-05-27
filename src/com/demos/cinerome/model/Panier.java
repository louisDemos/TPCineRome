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

	public int getQuantiteElement() {
		int nbreElt = 0;
		for (LignePanier lp : contenu) {
			nbreElt = nbreElt + lp.getQteCommande();
		}
		return nbreElt;
	}

	public void ajouterArticle(Article article, int qteCommande) {
		LignePanier lignepanier = new LignePanier(article, qteCommande);
		contenu.add(lignepanier);
	}

	public void retirerArticle(String reference) {
		for (int i = contenu.size() - 1; i >= 0; i--) {
			if (contenu.get(i).getArticle().getReference().equals(reference))
				contenu.remove(i);
		}
	}

	public void modifierQteArticle(String reference, int qte) {
		for (LignePanier lignepanier : contenu) {
			if (lignepanier.getArticle().getReference().equals(reference))
				lignepanier.setQteCommande(qte);
			// method + et méthode -
		}
	}

	public void modifierMoins(String reference) {
		for (LignePanier lignepanier : contenu) {
			int qtePlus = 0;
			if (lignepanier.getArticle().getReference().equals(reference)) {
				qtePlus = lignepanier.getQteCommande() - 1;
				if (qtePlus == 0) {
					retirerArticle(reference);
					break;
				}
				lignepanier.setQteCommande(qtePlus);
			}
		}
	}

	public void modifierPlus(String reference) {
		for (LignePanier lignepanier : contenu) {
			int qtePlus = 0;
			if (lignepanier.getArticle().getReference().equals(reference)) {
				qtePlus = lignepanier.getQteCommande() + 1;
				lignepanier.setQteCommande(qtePlus);
			}
		}
	}

	public double getPrixTotalHT() {

		double prix = 0;
		for (LignePanier lignepanier : contenu) {
			prix += lignepanier.getArticle().getPrixHT() * lignepanier.getQteCommande();
		}
		return prix;
	}

	public void setContenu(ArrayList<LignePanier> contenu) {
		this.contenu = contenu;
	}

	@Override
	public String toString() {
		return "Panier [contenu=" + contenu + "]";
	}

}
