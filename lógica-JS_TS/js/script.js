const calcular = document.getElementById('btn');
const resultado = document.getElementById('resultado');

function style(){
    resultado.style.backgroundColor = '#136864';
    resultado.style.color = 'white';
    resultado.style.margin = '0 155px';
    resultado.style.width = 'fit-content';
    resultado.style.padding = '5px 5px';
    
}


function imc() {
    
    const nome = document.getElementById('nome').value;
    const peso = document.getElementById('peso').value;
    const altura = document.getElementById('altura').value;
    const valorIMC = (peso/(altura*altura)).toFixed(1);
    
    if (nome !== '' && peso !== '' && altura !== '') {
        style();
        resultado.textContent = nome + ',seu valor de IMC é ' + valorIMC + ' verifique a tabela para mais informações.';
    } else {
        style();
        resultado.textContent = 'Preencha todos os campos!!!';

    }
}


calcular.addEventListener('click', imc);


