<%--
  Created by IntelliJ IDEA.
  User: sub2m
  Date: 22/12/2023
  Time: 09:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mon Site Vitrine</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }

        header {
            background-color: #333;
            color: #fff;
            padding: 1em;
            text-align: center;
        }

        nav {
            background-color: #444;
            padding: 1em;
            text-align: center;
        }

        nav ul {
            list-style: none;
            margin: 0;
            padding: 0;
        }

        nav ul li {
            display: inline;
            margin-right: 20px;
        }

        nav a {
            text-decoration: none;
            color: #fff;
            font-weight: bold;
        }

        section {
            max-width: 800px;
            margin: 20px auto;
            padding: 20px;
            background-color: #fff;
        }

        footer {
            background-color: #333;
            color: #fff;
            text-align: center;
            padding: 1em;
            position: fixed;
            width: 100%;
            bottom: 0;
        }
    </style>
</head>
<body>

<header>
    <h1>Bienvenue sur Mon Site Vitrine</h1>
    <p>Une description concise de votre site.</p>
</header>

<nav>
    <ul>
        <li><a href="#">Accueil</a></li>
        <li><a href="#">À Propos</a></li>
        <li><a href="#">Services</a></li>
        <li><a href="#">Contact</a></li>
    </ul>
</nav>

<section>
    <h2>Dernières Nouvelles</h2>
    <p>Ce que vous voulez mettre en avant sur votre page d'accueil.</p>
</section>

<footer>
    <p>&copy; 2023 Mon Site Vitrine. Tous droits réservés.</p>
</footer>

</body>
</html>
