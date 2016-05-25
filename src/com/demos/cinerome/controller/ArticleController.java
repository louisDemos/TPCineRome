package com.demos.cinerome.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.demos.cinerome.model.Article;
import com.demos.cinerome.model.Panier;

@Controller
public class ArticleController {

	// Affichage liste d'Articles sur page principale
	@RequestMapping(value = "/pageAccueil.htm", method = RequestMethod.GET)
	public String afficherArticles(ModelMap model, HttpSession session) {
		Article a1 = new Article("a1", "les misérables", "livre 1", "livre", "Miserables.png", 10, 50);
		Article a2 = new Article("a2", "chers voisins", "livre 2", "livre", "Voisins.png", 8, 40);
		Article a3 = new Article("a3", "Millenium", "livre 3", "livre", "Millenium.png", 12, 60);
		ArrayList<Article> listeArticle = new ArrayList<Article>();
		listeArticle.add(a1);
		listeArticle.add(a2);
		listeArticle.add(a3);

		model.put("listeModel", listeArticle);
		
		session.setAttribute("liste", listeArticle);
		
		return "accueil";
	}

	// Ajour d'un article dans le panier
	@RequestMapping(value = "/ajouterArticle.htm", method = RequestMethod.POST)
	public String ajouterArticle(@ModelAttribute("listeModel") ArrayList<Article> liste,HttpSession session, @RequestParam("reference") String reference, @RequestParam("qte") int qte) {
			System.out.println("ref "+ reference +" quantité : "+ qte);
			Panier panier = new Panier(); 
			panier.ajouterArticle(, qte);
			System.out.println(panier);

		return "accueil";
		

	}

}
