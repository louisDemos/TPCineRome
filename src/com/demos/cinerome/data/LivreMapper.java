package com.demos.cinerome.data;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.demos.cinerome.model.Livre;

public class LivreMapper implements RowMapper<Livre> {
	public Livre mapRow(ResultSet rs, int rowNum) throws SQLException {
		Livre livre = new Livre(null, null, null, null, null, rowNum, rowNum);
		livre.setReference(rs.getString("reference"));
		livre.setIsbn(rs.getString("isbn"));
		livre.setAuteur(rs.getString("auteur"));
		livre.setEditeur(rs.getString("editeur"));
		livre.setGenre(rs.getString("genre"));
		return livre;
	}
}
