let togg = true;

function changeClass(btn) {
    if (togg) {
        btn.classList.remove('btn-success');
        btn.classList.add('btn-danger');
    } else {
        btn.classList.remove('btn-danger');
        btn.classList.add('btn-success');
    }
    togg = !togg;
}

var sliderBicicleta = document.getElementById("QuantitatBicicleta");
var outputBicicleta = document.getElementById("ValorQuantitatBicicleta");
outputBicicleta.innerHTML = sliderBicicleta.value;

sliderBicicleta.oninput = function () {
    outputBicicleta.innerHTML = this.value;
}

var sliderPatinet = document.getElementById("QuantitatPatinet");
var outputPatinet = document.getElementById("ValorQuantitatPatinet");
outputPatinet.innerHTML = sliderPatinet.value;

sliderPatinet.oninput = function () {
    outputPatinet.innerHTML = this.value;
}

var sliderModificar = document.getElementById("modificarQuantitat");
var outputModificar = document.getElementById("modificarValorQuantitat");
outputModificar.innerHTML = sliderModificar.value;

sliderModificar.oninput = function () {
    outputModificar.innerHTML = this.value;
}

const taulaBicicletes = document.getElementById('taulaBicicletes');
const taulaPatinets = document.getElementById('taulaPatinets');
const crearBicicleta = document.getElementById('openCrearBicicleta');
const crearPatinet = document.getElementById('openCrearPatinet');

function handleRadioClick() {
    if (document.getElementById('buttonBicicletes').checked) {
        taulaBicicletes.style.display = 'table';
        taulaPatinets.style.display = 'none';
        crearBicicleta.style.display = 'inline-block';
        crearPatinet.style.display = 'none';
    } else {
        taulaBicicletes.style.display = 'none';
        taulaPatinets.style.display = 'table';
        crearBicicleta.style.display = 'none';
        crearPatinet.style.display = 'inline-block';
    }
}

const radioButtons = document.querySelectorAll('input[name="seleccionarLlista"]');
radioButtons.forEach(radio => {
    radio.addEventListener('click', handleRadioClick);
});