

var banners = ["Image/1.jpg", "Image/2.jpg", "Image/4.jpg"];
var bannerAtual = 0;

function trocaBanner() {
  bannerAtual = (bannerAtual + 1) % 3;
  document.querySelector('.hpPainelRotativo').style.backgroundImage = "url("+banners[bannerAtual]+")";
}

setInterval(trocaBanner, 4000);


