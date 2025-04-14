//A.1. Atunci când un pacient este internat in cadrul aplicației se face salvarea acestuia. Fiecare
//pacient are posibilitatea sa plătească extra pentru anumite facilitate precum: pat rabatabil, mic
//dejun inclus, papuci de camera, halat pentru interior. In cazul in care pacientul nu alege aceste
//facilitați extra, in cadrul aplicației sunt setate cu false. Să se dezvolte modulul care asigură crearea
//de obiecte de tipul pacient cu opțiuni extra.

import ro.cts.seminar05.Builder.Clase.Pacient;
import ro.cts.seminar05.Builder.Clase.PacientBuilder;

public class Main {
    public static void main(String[] args) {

        //v1
        PacientBuilder pacientBuilder = new PacientBuilder("George");
        Pacient pacient1 = pacientBuilder.setNumeInsotitor("Georgica").setAreHalatDeInterior(true).getPacient();

        Pacient pacient2 = pacientBuilder.setNumeInsotitor("Marica").setAreMicDejun(true).getPacient();
        System.out.println(pacient1.toString());
        System.out.println(pacient2.toString());

        //v2



    }


}