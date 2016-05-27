package com.demos.cinerome.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.demos.cinerome.model.Panier;

@Controller
public class PanierController {
	
	// AJOUTER
	@RequestMapping(value = "/ajoutPagePanier.htm", method = RequestMethod.POST)
	public String ajouterArticle() {		
		return "accueil";
	}
	// SUPPRIMER
	@RequestMapping(value="/suprPagePanier.htm", method=RequestMethod.POST)
	public String supprimerArticle(HttpSession session,@RequestParam("reference") String reference){		
		Panier panier = (Panier) session.getAttribute("lePanier");
		panier.retirerArticle(reference);
		return "panier";
	}
	// ARTICLE + 1
	@RequestMapping(value="/modifPlusPagePanier.htm", method=RequestMethod.POST)
	public String mofifierPlus(HttpSession session,@RequestParam("reference") String reference){
		Panier panier = (Panier) session.getAttribute("lePanier");
		panier.modifierPlus(reference);
		return "panier";
	}
	// ARTICLE + 1
	@RequestMapping(value="/modifMoinsPagePanier.htm", method=RequestMethod.POST)
	public String mofifierMoins(HttpSession session,@RequestParam("reference") String reference){
		Panier panier = (Panier) session.getAttribute("lePanier");
		panier.modifierMoins(reference);
		return "panier";
	}
	// CALCUL PRIX HT
	@RequestMapping(value="/prixPagePanier.htm", method=RequestMethod.POST)
	public String getPrixTotalHT(HttpSession session){
		Panier panier = (Panier) session.getAttribute("lePanier");
		session.setAttribute("prixtotalht", panier.getPrixTotalHT());
		return "panier";
	}

}





////MODIFIER
//	@RequestMapping(value="/modifPagePanier.htm", method=RequestMethod.POST)
//	public String modifierQteArticle(HttpSession session,@RequestParam("reference") String reference,@RequestParam("qte") int qte){		
//		Panier panier = (Panier) session.getAttribute("lePanier");
//		panier.modifierQteArticle(reference, qte);
//		return "panier";