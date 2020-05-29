<%@ taglib prefix = "ex" uri = "./security.tld"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page trimDirectiveWhitespaces="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Home page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
    <body>
         
        <h2>Home page</h2>
        
        <p>Available actions:</p>
        
        <ul>
            <li><a href="cars?action=listcars">Show All Cars</a></li>
            <li><a href="cities?action=cities">Show all Cities</a></li>
            <li><a href="cities?action=citychart">City Pie Chart</a></li>
            <li><a href="group?action=AB">Group</a></li>
            <li><a href="carloan?action=loan">Car Loan</a></li>
            
        </ul>
        
        <jsp:include page="inc-common-menu.jsp" />
        <ex:security id="securityTag" />
         
    </body>
</html>

