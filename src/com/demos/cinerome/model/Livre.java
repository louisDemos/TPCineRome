package com.demos.cinerome.model;

public class Livre extends Article{

	public Livre(String reference, String titre_art, String resume, double prixHT, double prixTTC) {
		super(reference, titre_art, resume, prixHT, prixTTC);
		
	}

	private int isbn;
	private int nbpage;
	private String titre_livre;
	private String auteur;
	private String editeur;
	private String genre;

	
	

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getIsbn() {
		return isbn;
	}

	public String getTitre_livre() {
		return titre_livre;
	}

	public String getEditeur() {
		return editeur;
	}

	public String getGenre() {
		return genre;
	}

	public int getNbpage() {
		return nbpage;
	}

	public void setNbpage(int nbpage) {
		this.nbpage = nbpage;
	}

}
