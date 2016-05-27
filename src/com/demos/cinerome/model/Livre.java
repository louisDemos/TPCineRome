package com.demos.cinerome.model;

public class Livre extends Article {

	public Livre(String reference, String designation, String informations, String categorie, String nom_image,
			double prixHT, int qteStock) {
		super(reference, designation, informations, categorie, nom_image, prixHT, qteStock);

	}

	private String isbn;
	private String auteur;
	private String editeur;
	private String genre;

	@Override
	public String toString() {
		return "Livre [isbn=" + isbn + ", auteur=" + auteur + ", editeur=" + editeur + ", genre=" + genre + "]";
	}

	public void equals() {

	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public String getAuteur() {
		return auteur;
	}

	public String getEditeur() {
		return editeur;
	}

}
