// Call the dataTables jQuery plugin
$(document).ready(function() {
    cargaCitas();
  $('#citas').DataTable();
});

async function cargaCitas(){
    const request = await fetch('api/citas', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    });
    const content = await request.json();
    console.log(content);

    let listadoHtml = '';

    for(let cita of content){
    let botonEliminar ='<a href="#" onclick="eliminarCita('+cita.id+')" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';

    let registroHTML = '<tr><td>'+cita.id+'</td><td>'+cita.consultorio+'</td><td>'
        +cita.doctor+'</td><td>'+cita.horario+'</td><td>'
        +cita.paciente+'</td><td>'+botonEliminar+'</td></tr>';
   listadoHtml+= registroHTML;
    }
    document.querySelector('#citas tbody').outerHTML = listadoHtml;
}

async function eliminarCita(id){
   const request = await fetch('api/citas/'+ id, {
        method: 'DELETE',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    });

}