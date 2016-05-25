package com.demos.cinerome.model;

public class Article {

	private String reference;
	private String designation;
	private String informations;
	private String categorie="livre";
	private String nom_image;
	private double prixHT;
	private int qteStock;

	public Article(String reference, String designation, String informations, String categorie, String nom_image,
			double prixHT, int qteStock) {
		super();
		this.reference = reference;
		this.designation = designation;
		this.informations = informations;
		this.categorie = categorie;
		this.nom_image = nom_image;
		this.prixHT = prixHT;
		this.qteStock = qteStock;
	}

	@Override
	public String toString() {
		return "Article [reference=" + reference + ", designation= " + designation + ", informations=" + informations
				+ ", prixHT=" + prixHT + "]";
	}

	public void equals() {

	}

	public double getPrixTTC() {
		double prixTTC = 0;
		if (categorie == "livre")
			prixTTC = prixHT * 1.055;
		return prixTTC;

	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getInformations() {
		return informations;
	}

	public void setInformations(String informations) {
		this.informations = informations;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getNom_image() {
		return nom_image;
	}

	public void setNom_image(String nom_image) {
		this.nom_image = nom_image;
	}

	public double getPrixHT() {
		return prixHT;
	}

	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}

	public int getQteStock() {
		return qteStock;
	}

	public void setQteStock(int qteStock) {
		this.qteStock = qteStock;
	}



}