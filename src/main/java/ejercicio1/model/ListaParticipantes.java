package ejercicio1.model;

import java.util.ArrayList;

public interface ListaParticipantes {

    public abstract void addParticipante(Participante p) ;

    public abstract Participante recuperarParticipante(Participante p) ;
    public abstract ArrayList<Participante> getParticipantes();
}
