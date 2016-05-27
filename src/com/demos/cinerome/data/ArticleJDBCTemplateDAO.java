package com.demos.cinerome.data;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import com.demos.cinerome.model.Article;
import com.demos.cinerome.model.Livre;


public class ArticleJDBCTemplateDAO implements ArticleDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);	
	}
	@Override
	public void create(String reference, String designation, String informations, String categorie, String nom_image,
			double prixHT, int qteStock) {		
		String SQL="insert into Article (reference) values(?)";
		jdbcTemplateObject.update(SQL, reference);
		System.out.println("Article crée = " + reference);
		return;	
	}
	@Override
	public Article getArticle(String reference) {
		String SQL = "select * from Livre where reference = ?";
		Article article = jdbcTemplateObject.queryForObject(SQL, new Object[] {reference}, new ArticleMapper());
		return article;		
	}
	
	public List<Article> listArticle() {
		String SQL = "select * from Article";
		List<Article> articles = jdbcTemplateObject.query(SQL, new ArticleMapper());
		return articles;
	}
	@Override
	public void delete(String reference) {
		String SQL = "delete from Article where reference = ?";
		jdbcTemplateObject.update(SQL, reference);
		System.out.println(" supression de l'ancienne ref " + reference);
		return;
	}

	@Override
	public void update(String reference, String designation, String informations, String categorie, String nom_image,
			double prixHT, int qteStock) {
		String SQL = "update Article set deisgnation = ? where reference = ?";
		jdbcTemplateObject.update(SQL, reference, designation);
		System.out.println("Updated Record with ID = " + reference);
		return;
		
	}

	
	

}
