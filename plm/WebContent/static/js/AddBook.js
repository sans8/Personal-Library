function validate()	{
	var title = document.getElementById("titleId");
	var author = document.getElementById("authorId");
	price = document.getElementById("priceId");
	publisher = document.getElementById("publisherId");
	isbn = document.getElementById("isbnId");
	var flag=0;
	if(title.value == "")	{
		title.focus();
		document.getElementById("stitle").innerHTML = "Required";
		flag=1;
	}
	if(author.value == "")	{
		author.focus();
		document.getElementById("sauthor").innerHTML = "Required";
		flag=1;
	}
	if(price.value == "")	{
		price.focus();
		document.getElementById("sprice").innerHTML = "Required";
		flag=1;
	}
	if(publisher.value == "")	{
		publisher.focus();
		document.getElementById("spublisher").innerHTML = "Required";
		flag=1;
	}
	if(isbn.value == "")	{
		isbn.focus();
		document.getElementById("sisbn").innerHTML = "Required";
		flag=1;
	}
	if(isNaN(price.value))	{
		price.focus();
		document.getElementById("sprice").innerHTML = "Invalid price";
		flag=1;
	}
	if(isNaN(isbn.value))	{
		isbn.focus();
		document.getElementById("sisbn").innerHTML = "Invalid isbn";
		flag=1;
	}
	if(flag==1)	
		return false;
}