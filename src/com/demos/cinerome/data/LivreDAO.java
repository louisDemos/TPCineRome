package com.demos.cinerome.data;

import java.util.List;

import javax.sql.DataSource;

import com.demos.cinerome.model.Livre;



public interface LivreDAO {
	
public void setDataSource(DataSource ds);
	
	public Livre getLivre(String reference);
	
	public List<Livre> listLivre();//crit recherche
	
	public void delete (String reference);
	
	public void update (String isbn, String auteur, String editeur, String genre,String reference, String designation, 
						String informations, String categorie, String nom_image, double prixHT,int qteStock);
}


