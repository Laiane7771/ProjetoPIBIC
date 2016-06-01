window.onscroll = scroll;

function scroll(){
	var myPageX;
	var myPageY;
	if(document.all){
		myPageX = document.documentElement.scrollLeft;
		myPageY = document.documentElement.scrollTop;
	}
	else{
		myPageX = window.pageXOffset;
		myPageY = window.pageYOffset;
	}
	document.getElementByid("idalgumaCoisa").value = myPageY;
	gravaCookie(myPageY);
}

function gravaCookie(Y){
	var dtmData = new Date();
	var lngDias = 1;
	if(lngDias){
		dtmData.setTime(dtmData.getTime() + 10000);
		var strExpira = "; expires =" + dtmData.toGMTString();
	}
	else{
		var strExpira = "";
	}document.cookie = 'PagePosition' + "=" + Y + strExpira;
}

function LerCookie(strCookie){
	var strNomeIgual = strCookie + "=";
	var arrCookies = document.cookie.split(';');
	for(var i = 0; i<arrCookies.lenght; i++){
		var strValorCookie = arrCookies[i];
		while(strValorCookie.charAt(0)==' '){
			strValorCookie = strValorCookie.subString(1, strValorCookie.length);
		}
		if(strValorCookie.indexOf(strNomeIgual)==0){
				return strValorCookie.substring(strNomeIgual.length, strValorCookie.length);
		}
	}
	return null;
}