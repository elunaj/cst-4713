<%@ taglib prefix = "ex" uri = "./security.tld"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page trimDirectiveWhitespaces="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Group</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://unpkg.com/purecss@1.0.0/build/pure-min.css" 
              integrity="sha384-nn4HPE8lTHyVtfCBi5yW9d20FjT8BJwUXyWZT9InLYax14RDjBj46LmSztkmNP9w"
              crossorigin="anonymous">  

        <style>
            body { 
            	padding: 1em;
             }
            
            nav { margin-top: 2em }
            
            #links {
            	width: 100%;
            	text-align: left;
            }
            
            #links ul li {
            	display: inline-table;
            	list-style: none;
           		margin: 0px 25px 5px 10px;
           		float: left;
            }
            
            .table th {
    text-align: center;
}

.table {
    border-radius: 5px;
    width: 50%;
    float: none;
}
            .money {align: "right" }
        </style>
    </head>
    <body>

        <h2>${pagecode} Group Report</h2>
        
            
        	<div id="links">
	            <ul>
	 
		            <li><a href="group?action=AB">AB</a></li>
		            <li><a href="group?action=DC">DC</a></li>
		            <li><a href="group?action=EF">EF</a></li>
		            <li><a href="group?action=GG">GG</a></li>
		            <li><a href="group?action=HK">HK</a></li>
		            <li><a href="group?action=LM">LM</a></li>
		            <li><a href="group?action=OP">OP</a></li>
		            <li><a href="group?action=QR">QR</a></li>
		            <li><a href="group?action=ST">ST</a></li>
		            <li><a href="group?action=UV">UV</a></li>
		            <li><a href="group?action=WX">WX</a></li>
		        
	        	</ul>
	            
	        </div>

        <table class="pure-table pure-table-horizontal">
            <thead>
                <tr>
                    <th>group</th>
                    <th>name</th>
                    <th>city</th>
                    <th>month</th>
                    <th>pricePaid</th>
                    <th>vendorPrice</th>
                    <th>income</th>
                </tr>
            </thead>

			<tbody>
            <c:forEach items="${groupList}" var='group'>
                <tr>
                    <td>
                        <c:out value="${group.group}"/>
                    </td>
                    <td>
                        <c:out value="${group.name}"/>
                    </td>
                    <td>
                        <c:out value="${group.city}"/>
                    </td>
                     <td>
                        <c:out value="${group.month}"/>
                    </td>
                    <td>
                        <c:out value="${group.pricePaid}"/>
                    </td>
                    <td align="right">
                        <c:out value="${group.vendorPrice}"/>
                    </td>  
                    
                     <td align="right">
                        <c:out value="${group.income}"/>
                    </td>                   
                </tr>
               
            </c:forEach> 
            </tbody>
            
            <tfoot>
                <tr>
	             	<td colspan='6'>Total: </td>
	             	<td><c:out value="${total}" /> </td>                   
                </tr>
     		 	<tr>
	             	<td colspan='6'>Average: </td>
	             	<td><c:out value="${average}" /> </td>                   
                </tr>
	        </tfoot> 
            
        </table>
        <jsp:include page="inc-common-menu.jsp" />
		<ex:security id="securityTag" />
    </body>
 
    
</html>

