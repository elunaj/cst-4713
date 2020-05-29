
<!-- Start Security Tag -->
<div id="$id$">
</div>

<script>
/**
 * Start of Security Code Tag Generator
 */

(function() {
	// This code will attempt 
	// minutes paramter which $minutes$
	let divSecurity = document.getElementById("$id$");
	let interval, countDown = 60 * $minutes$;
	let orgCountDown = countDown;
	
	let logic = function() {
		divSecurity.innerHTML = "countDown: " + countDown;
		countDown--;
		
		if (countDown <= 0) {
			clearInterval(interval);
			divSecurity.innerHTML = "Expired";
			window.location.href = "logout";
		}
	};
	
	interval = setInterval(logic, 1000);
	
	let bodyTag = document.getElementsByTagName("body")[0];
	
	bodyTag.onclick = () => {
		countDown = orgCountDown;
		console.log({countDown, orgCountDown});
	};
	
}) ();
</script>

<!-- End Security Tag --> 
