// Call the dataTables jQuery plugin
$(document).ready(function() {
//on ready
});

async function registraCita(){

let nombre=  document.getElementById('txtNombre').value;
let apellido= document.getElementById('txtApellido').value;
let nombreCompleto = nombre+ ' ' + apellido;
let datos = {};
datos.consultorio= document.getElementById('idConsultorio').value;
datos.doctor= document.getElementById('txtDoctor').value;
datos.horario= document.getElementById('txtHorario').value;
datos.paciente = nombreCompleto;

   const request = await fetch('api/citas', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
    });
    const content = await request.json();
}
