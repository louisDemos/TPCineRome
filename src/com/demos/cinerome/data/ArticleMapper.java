package com.demos.cinerome.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.demos.cinerome.model.Article;

public class ArticleMapper implements RowMapper<Article> {
	public Article mapRow(ResultSet rs, int rowNum) throws SQLException {
		Article article= new Article();
		article.setReference(rs.getString("reference"));
		article.setDesignation(rs.getString("designation"));
		article.setInformations(rs.getString("informations"));
		article.setCategorie(rs.getString("categorie"));
		article.setNom_image(rs.getString("nom_image"));
		article.setPrixHT(rs.getInt("prixht"));
		article.setQteStock(rs.getInt("qtestock"));
		return article;
		
	}

}
