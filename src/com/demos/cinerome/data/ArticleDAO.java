package com.demos.cinerome.data;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.demos.cinerome.model.Article;



public interface ArticleDAO {
	
public void setDataSource(DataSource ds);
	
	public void create(String reference, String designation, String informations, String categorie,
					   String nom_image, double prixHT,int qteStock);
	
	public Article getArticle(String reference);
	
	public List<Article> listArticle();
	
	public void delete (String reference);
	
	public void update (String reference, String designation, String informations, String categorie,
			   			String nom_image, double prixHT,int qteStock);
}


