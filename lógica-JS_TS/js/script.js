




function calculaIMC(){
    var btn = document.querySelector('btn');
    var peso =  document.querySelector('input-Peso');
    var altura = document.querySelector('input-Altura');
    
    var calculoIMC = peso/sqr(altura);

    console.log(calculoIMC);
    btn.onclick = calculaIMC()

}

