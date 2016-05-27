package com.demos.cinerome.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.demos.cinerome.data.ArticleDAO;
import com.demos.cinerome.data.ArticleJDBCTemplateDAO;
import com.demos.cinerome.data.LivreDAO;
import com.demos.cinerome.model.Article;
import com.demos.cinerome.model.Panier;


@Controller
public class ArticleController {
	
	@Autowired
	private ArticleDAO articleDAO;
	
	
	

	// Affichage liste d'Articles sur page principale
	@RequestMapping(value = "/pageAccueil.htm", method = RequestMethod.GET)
	public String afficherArticles(ModelMap model, HttpSession session) {
		/*Article a1 = new Article("a1", "les misérables", "livre 1", "livre", "Miserables.png", 10, 50);
		Article a2 = new Article("a2", "chers voisins", "livre 2", "livre", "Voisins.png", 8, 40);
		Article a3 = new Article("a3", "Millenium", "livre 3", "livre", "Millenium.png", 12, 60);
		ArrayList<Article> listeArticle = new ArrayList<Article>();
		listeArticle.add(a1);listeArticle.add(a2);listeArticle.add(a3);*/
		List<Article> listeArticle =  articleDAO.listArticle();
		model.put("listeModel", listeArticle);
		Panier panier = (Panier) session.getAttribute("lePanier");
		if (panier == null) {
			panier = new Panier();
			session.setAttribute("lePanier", panier);
		}		
		session.setAttribute("listeModel", listeArticle);
		session.setAttribute("nbreElt", panier.getQuantiteElement());
		return "accueil";
	}

	// Ajout d'un article dans le panier
	@RequestMapping(value = "/ajouterArticle.htm", method = RequestMethod.POST)
	public String ajouterArticle(HttpSession session,@RequestParam("reference") String reference, @RequestParam("qte") int qte) {

		Panier panier = (Panier) session.getAttribute("lePanier");
		ArrayList<Article> listeArticle = (ArrayList<Article>) session.getAttribute("listeModel");

		if (panier == null) {
			panier = new Panier();
			session.setAttribute("lePanier", panier);
		}

		for (Article a : listeArticle) {
			if (reference.equals(a.getReference())) {
				panier.ajouterArticle(a, qte);
			}
		}
		
		session.setAttribute("nbreElt", panier.getQuantiteElement());
		
		return "accueil";

	}
	
	@RequestMapping(value = "/pagePanier.htm", method = RequestMethod.POST)
	public String afficherPanier(){
		return "panier";
	}

}
