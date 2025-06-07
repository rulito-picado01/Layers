package ejercicio1.model;



public class AplicacionRegistracionParticipantes {
    private ListaParticipantes participantes;

    public AplicacionRegistracionParticipantes(ListaParticipantes participantes) {
        this.participantes = participantes;
    }

    public void agregarParticipantes(String nombre, String telefono, String region) {
        try{
            Participante p = new Participante(nombre, telefono, region);
            participantes.addParticipante(p);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

}