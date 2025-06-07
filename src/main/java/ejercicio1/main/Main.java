package ejercicio1.main;

import ejercicio1.database.ParticipanteBd;
import ejercicio1.model.AplicacionRegistracionParticipantes;
import ejercicio1.ui.AgregarParticipantesUI;

public class Main {
    public static void main(String[] args) {
        launchApplication();
    }

    private static void launchApplication() {
        try {
            ParticipanteBd aplicacionBd = new ParticipanteBd(); // Declare and initialize the variable
            AplicacionRegistracionParticipantes AplicacionRegistracionParticipantes = new AplicacionRegistracionParticipantes(
                    aplicacionBd);
            AgregarParticipantesUI UIpar = new AgregarParticipantesUI(AplicacionRegistracionParticipantes);
            UIpar.setupUIComponents();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
