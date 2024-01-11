<%--
  Created by IntelliJ IDEA.
  User: sub2m
  Date: 22/12/2023
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Formulaire de création de user:</h1>
<br>
<form method="post" action="create.jsp">
    <fieldset>
        <label for="nom">Nom</label>
        <input type="text" id="nom" name="nom">
        <br>

        <label for="prenom">Nom</label>
        <input type="text" id="prenom" name="prenom">
        <br>

        <label for="email">Nom</label>
        <input type="text" id="email" name="email">
        <br>

        <label for="tel">Nom</label>
        <input type="text" id="tel" name="tel">
        <br>

        <input type="reset" value="Réinitialiser">
        <input type="submit" value="Valider">
        <a href="http://localhost:8080/tomcat/client$id=$(id)">Lien vers le user crée</a>
    </fieldset>
</form>
</body>
</html>
