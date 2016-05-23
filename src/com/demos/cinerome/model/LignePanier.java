package com.demos.cinerome.model;

public class LignePanier {

	private Article article;
	private int qteCommande;

	public LignePanier(Article article, int qteCommande) {
		super();
		this.article = article;
		this.qteCommande = qteCommande;
	}

	public Article getArticle() {
		return article;
	}

	public int getQteCommande() {
		return qteCommande;
	}

}
