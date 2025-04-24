package ro.cts.seminar05.BuilderV2.main;//A.1. Atunci când un pacient este internat in cadrul aplicației se face salvarea acestuia. Fiecare
//pacient are posibilitatea sa plătească extra pentru anumite facilitate precum: pat rabatabil, mic
//dejun inclus, papuci de camera, halat pentru interior. In cazul in care pacientul nu alege aceste
//facilitați extra, in cadrul aplicației sunt setate cu false. Să se dezvolte modulul care asigură crearea
//de obiecte de tipul pacient cu opțiuni extra.

import ro.cts.seminar05.BuilderV2.Clase.Pacient;
import ro.cts.seminar05.BuilderV2.Clase.PacientBuilder;

public class Main2 {
    public static void main(String[] args) {


        PacientBuilder pacientBuilder = new PacientBuilder();
        pacientBuilder.setNumeInsotitor("Marica").setAreMicDejunInclus(true).setArePapuciDeCamera(true);

        Pacient pacient = pacientBuilder.build("Costel");
        System.out.println(pacient.toString());

        Pacient pacient1 = pacientBuilder.setNumeInsotitor("Maria").build("Ion");
        System.out.println(pacient1.toString());

        Pacient pacient2 = pacientBuilder.setNumeInsotitor("Joana").build("Nicu");
        System.out.println(pacient2.toString());

    }


}