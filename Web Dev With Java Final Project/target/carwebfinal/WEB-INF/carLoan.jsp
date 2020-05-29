<%@ taglib prefix = "ex" uri = "./security.tld"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page trimDirectiveWhitespaces="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>    
    <title>Car Loan for Year 2k</title>

    <link rel="stylesheet" href="./css/format.css">
    <script>
    
    	function showLoanScenarios() {
    		document.forms[0].submit();
    	}
    	
    	function updateInput(id, value) {
    		document.getElementById(id).value = value;
    	}
    
    </script>
</head>
<body> 
<h1>Loan Scenarios / Car Payments</h1>
   <form method="POST" action="./carloan"> 
        S: Scenario <input id="numOfScen" type="text" name="numOfScen" class="ink" value="25" onchange="updateInput(this.id, this.value)" />
	    L: Loan Amount <input id="amount" type="text" name="amount" value="1000000" onchange="updateInput(this.id, this.value)" />
	    I: Interest Rate <input id="rate" class="interest" type="text" name="rate" value="5" onchange="updateInput(this.id, this.value)" /> %
	    M: Monthly Payments <input type="button" class="calculate" value="calculate" onclick="showLoanScenarios()" />
    <form> 

	 <hr />
  	<div class="divBody">
    
    	<c:forEach items="${scenarios}" var='scenario'>
	    <div class='divScenario'>
	    	<span>S:</span> <c:out value="${scenario.id}"/> <br />
	        <span>L:</span> <c:out value="${scenario.financeAmount}"/><br />
	        <span>M:</span> <c:out value="${scenario.monthlyPayment}"/> <br />
	         <c:choose>
	         	<c:when test = "${scenario.monthlyPayment - firstCase.monthlyPayment < 50}">
		        <img class="moneyimg" src="./images/placeholder.png" />
	        	</c:when>
	        	<c:when test = "${scenario.monthlyPayment - firstCase.monthlyPayment > 50 &&
	        	scenario.monthlyPayment - firstCase.monthlyPayment < 100}">
		        <img class="moneyimg" src="./images/money.png" />
	        	</c:when>
	        	<c:when test = "${scenario.monthlyPayment - firstCase.monthlyPayment > 100}">
		        <img class="moneyimg" src="./images/100-Bucks.jpg" />
	        	</c:when>
	        </c:choose>
	        
	       
	                
	         
	    </div>
	   
	   </c:forEach>     
    </div>
</body>
</html>