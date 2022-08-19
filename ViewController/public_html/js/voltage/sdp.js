//JavaScript support for the health care enrollment form

//Number of name tokens
var numberNames = 84;

//Strings for first name generation
var firstNames = [ "Alex", "Andy", "Abby", "Alice", "Bob", "Ben", "Becky", "Bridget", "Carl", "Craig", "Cindy", "Clara", "Doug", "Dagwood", "Debbie", "Darla", 
"Ed", "Evan", "Elisa", "Erin", "Fred", "Frank", "Fran", "Freda", "George", "Greg", "Grace", "Giselle", "Henry", "Howard", "Heather", "Helga",
"Iggie", "Irwin", "Inga", "Ilvire", "Jason", "Jamin", "Jennifer", "Jasmine", "Karl", "Ken", "Karen", "Karla", "Larry", "Lloyd", "Lacy", "Lila", 
"Max", "Melvin", "Mary", "Myrtle", "Nevin", "Noyce", "Nina", "Nellie", "Oscar", "Oswald", "Olivia", "Orchard", "Paul", "Peter", "Patricia", "Pearl",
"Ron", "Ralph", "Racine", "Raleigh", "Sam", "Steve", "Sara", "Susan", "Tom", "Terrance", "Trish", "Trina", "Vance", "Vinnie", "Violet", "Vivian",
"Walter", "William", "Wyona", "Wanda" ];

//Strings for last name generation
var lastNames = [ "Applewood", "Abernathy", "Archer", "Allen", "Babcock", "Bouchet", "Braxton", "Bouregard", "Carter", "Crabner", "Cillikia", "Connor",
"Destrehan", "Denver", "Dalles", "Dortmund", "Esplanade", "Eisenhower", "Ereleven", "Entimani", "Farenheit", "Fabrege", "Factor", "Frichand",
 "Gregord", "Griswild", "Grandeur", "Grenthasman", "Hughes", "Hyatt", "Hilibrand", "Hortmund", "Ivanderson", "Intregart", "Inglemani", "Itvanictas",
 "Jerroldman", "Journeyman", "Janparhet", "Jambalaya", "Kragen", "Kazarian", "Karmanathis", "Kreetveltd", "Landerson", "Lillihamer", "Livithian", "Lomanezhik",
 "Mantrouse", "Mingleson", "Mentromeshyan", "Mervelindink", "Noyce", "Nirivenhan", "Normalitz", "Nivendian", "Oscarenolyds", "Onnasian", "Omnivoranious", "Ortmund",
 "Pulzheniki", "Pantroseman", "Pederson", "Pevalk", "Randstone", "Rismund", "Regalathner", "Ripicon", "Sampson", "Stevenson", "Splederuhi", "Spigner",
 "Talbot", "Terenevedt", "Tetrehedri", "Terminalousouki", "Venessian", "Vaughn", "Vereni", "Vivelman", "Wiferdson", "Worth", "Wentword", "Wineldyk" ];

//Last day of each month, Jan..Dec
var lastDay = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];

function genRandom(range)
//Returns numbers psuedo randomly between 0..range - 1
//Add 1 to the result if you want 1..range instead
{
	return Math.floor(Math.random() * range);
}

//Number of digits in a credit card
var maxCardDigits = 16;

//Psuedo randomly generates a payment card number with spaces between groups of four digits
function getCardNumber()
{
	result = "";
	for (i = 0; i < maxCardDigits; i++)
	{
		if (i != 0 && i % 4 == 0)
		{
			result += " ";
		}
		result += genRandom(10);
	}
	return result;
}

//Expiration date length (MM/YYYY)
var expirationLength = 7;

//Generates a MM/YYYY expiration date
function getExpiration()
{
	result = (genRandom(12) + 1) + "/" + (2016 + genRandom(5));
	if (result.length < expirationLength)
	{
		result = "0" + result;
	}
	return result;
}

//Returns a price between 499.00 and 999.99 pseudo randomly
function getEach()
{
  dollars = 498 + genRandom(500);
  cents = "." + genRandom(10) + genRandom(10);
  return dollars + cents;
}


//Automatically populates the credit card and invoice
function populateForm()
{
	firstName = firstNames[genRandom(numberNames)];
	lastName = lastNames[genRandom(numberNames)];
	document.getElementById("member").value = firstName + " " + lastName;
	document.getElementById("account").value = getCardNumber();
	document.getElementById("expires").value = getExpiration();
	priceEach = getEach();
	document.getElementById("each").value = priceEach;
	document.getElementById("amount").value = priceEach * 2.0;
}

//Checks to make sure the data in the form is valid or not
function validateForm()
{
	var parsingError = false;
	var errorMessage = "Please correct the following field entries:\n\n";
	
	//Name
	var validName = /.{4}.+/;
	if (!validName.test(document.getElementById("member").value))
	{
		parsingError = true;
		errorMessage += "- Member must be at least five characters.\n";
	}
	
	var validCardNumber = /[0-9]{4} [0-9]{4} [0-9]{4} [0-9]{4}/;
	
	if (!validCardNumber.test(document.getElementById("account").value))
	{
		parsingError = true;
		errorMessage += "- Account must be four groups of four digits separated with spaces.\n";
	}
	
	var validExpiration = /[0-9]{2}\/[0-9]{4}/;
	if (!validExpiration.test(document.getElementById("expires").value))
	{
		parsingError = true;
		errorMessage += "- Expires must be date in MM/YYYY format.\n";
	}
	
	if (parsingError)
	{
		alert (errorMessage);
	}
	else
	{
		document.forms["hpCreditCard"].submit();
	}
}
		