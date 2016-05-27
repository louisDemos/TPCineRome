
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Liste des articles</title>
</head>
<body>

	<c:forEach var="listeAr" items="${listeModel}">

		<img src="images/${listeAr.nom_image}" alt="bug image" width="50"height="50" />		
		designation ${listeAr.designation} reference : ${listeAr.reference}
			
		    
			<form action="ajouterArticle.htm" method="post">
				<label>qte</label> : <input type="text"	name="qte" />
				<input type="hidden" value="${listeAr.reference}" name="reference" />
				<input type="submit" value="ajouter">				
			</form><br><br>
		
	</c:forEach>

	
		<p><label>Nombre d'articles dans Panier </label> : <input type="text"value="${nbreElt}"  /></p>
	
	
	<form action="pagePanier.htm" method="post">
		<input type="submit" value="aller dans le panier">
	</form>

</body>
</html>