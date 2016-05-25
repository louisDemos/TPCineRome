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
	
	@RequestMapping(value="/ajouterArticle.htm", method=RequestMethod.POST)
	public String ajouterArticle(ModelMap model) {
		Article article = new Article("a1","les misérables" , "livre 1", "livre", "Miserables",
				10 , 50);
		
		model.put("panierModel", article);
		
		return "panier";
	}

}
