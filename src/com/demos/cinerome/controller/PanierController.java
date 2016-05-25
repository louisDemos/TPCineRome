package com.demos.cinerome.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class PanierController {
	
	@RequestMapping(value="/pagePanier.htm", method=RequestMethod.POST)
	public String ajouterArticle(ModelMap model) {
		
		
		
		
		return "panier";
	}

}
