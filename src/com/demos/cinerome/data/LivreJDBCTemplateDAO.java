package com.demos.cinerome.data;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import com.demos.cinerome.model.Livre;



public class LivreJDBCTemplateDAO implements LivreDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);		
	}

	@Override
	public Livre getLivre(String reference) {
		String SQL = "select * from Livre where reference = ?";
		Livre livre = jdbcTemplateObject.queryForObject(SQL, new Object[] {reference}, new LivreMapper());
		return livre;
		
	}

	@Override
	public List<Livre> listLivre() {
		String SQL = "select * from Livre";
		List<Livre> livre= jdbcTemplateObject.query(SQL, new LivreMapper());
		return livre;
	}

	@Override
	public void delete(String reference) {
		String SQL = "delete from Livre where reference = ?";
		jdbcTemplateObject.update(SQL, reference);
		System.out.println(" supression de l'ancien id " + reference);
		return;
	}

	@Override
	public void update(String isbn, String auteur, String editeur, String genre, String reference, String designation,
			String informations, String categorie, String nom_image, double prixHT, int qteStock) {
		// TODO Auto-generated method stub
		
	}
	

}
