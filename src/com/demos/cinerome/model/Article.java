package com.demos.cinerome.model;

public class Article {

	private String reference;
	private String titre_art;
	private String resume;
	private double prixHT;
	private double prixTTC;

	public Article(String reference, String titre_art, String resume, double prixHT, double prixTTC) {
		super();
		this.reference = reference;
		this.titre_art = titre_art;
		this.resume = resume;
		this.prixHT = prixHT;
		this.prixTTC = prixTTC;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public double getPrixHT() {
		return prixHT;
	}

	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}

	public double getPrixTTC() {
		return prixTTC;
	}

	public void setPrixTTC(double prixTTC) {
		this.prixTTC = prixTTC;
	}

	public String getReference() {
		return reference;
	}

	public void setTitre_art(String titre_art) {
		this.titre_art = titre_art;
	}

}
