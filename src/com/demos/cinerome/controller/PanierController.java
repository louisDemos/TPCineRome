package com.demos.cinerome.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demos.cinerome.model.Article;

public class PanierController {
	
	@RequestMapping(value="/pagePanier.htm", method=RequestMethod.POST)
	public String ajouterArticle(ModelMap model) {
		
		
		
		
		return "panier";
	}

}
