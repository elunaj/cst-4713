<%@ taglib prefix = "ex" uri = "./security.tld"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page trimDirectiveWhitespaces="true" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Car details</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://unpkg.com/purecss@1.0.0/build/pure-min.css" 
              integrity="sha384-nn4HPE8lTHyVtfCBi5yW9d20FjT8BJwUXyWZT9InLYax14RDjBj46LmSztkmNP9w"
              crossorigin="anonymous">      
        <style>
            body { padding:1em }
            nav { margin-top: 2em }
        </style>

    </head>

    <body>

        <form class="pure-form pure-form-stacked" action="controller?action=savecar" method="post">

            <legend>Enter car details:</legend>

            <label for="carName">Name:</label>
            <input id="carName" type="text" name="carName">

            <label for="carPrice">Price:</label>
            <input id ="carPrice" type="text" name="carPrice">

            <button class="pure-button pure-button-primary" type="submit">Submit</button>

        </form>

        <nav>
        	<a href="<%= request.getContextPath() %>">Home</a>
        </nav>           
		<ex:security id="securityTag" />
    </body>
</html>

