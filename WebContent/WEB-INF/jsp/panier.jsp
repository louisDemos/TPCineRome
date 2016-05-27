<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Votre Panier</title>
</head>
<body>
	Votre PANIER Contient :
	<br>
	<br>
	<br>
	<br>

	<c:forEach var="lp" items="${lePanier.contenu}">
		L'article : "${lp.article.designation}" Quantité Commandée : "${lp.qteCommande}" Prix/unité : "${lp.article.prixHT}" 
		
 		<form action="modifPlusPagePanier.htm" method="post">
			<input type="hidden" value="${lp.article.reference}" name="reference" />
			<input type="submit" value="+">
		</form>
		
		<form action="modifMoinsPagePanier.htm" method="post">
			<input type="hidden" value="${lp.article.reference}" name="reference" />
			<input type="submit" value="-">
		</form>

		<form action="suprPagePanier.htm" method="post">
			<input type="hidden" value="${lp.article.reference}" name="reference" />
			<input type="submit" value="supprimer" name="suprrimer">
		</form>
		<br>
		<br>

	</c:forEach>

	<form action="ajoutPagePanier.htm" method="post">
		<input type="submit" value="Ajouter un Nouvel Article">
	</form>



	<form action="prixPagePanier.htm" method="post">
		<input type="submit" value="Calcul Prix Total" name="calculprix">
		<input type="text" value="${prixtotalht}">
	</form>




</body>
</html>



