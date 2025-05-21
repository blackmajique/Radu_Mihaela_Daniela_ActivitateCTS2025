package main;

//    9. Să se implementeze structura ierarhică a agențiilor
//    băncii știindu-se faptul că o sucursală deține mai
//            multe agenții, iar o agenție deține mai multe filiale.

import clase.Agentie;
import clase.Filiala;
import clase.Structura;
import clase.Sucursala;

public class Main {
    public static void main(String[] args) throws Exception {
        Structura filiala1 = new Filiala("Da");
        Structura filiala2 = new Filiala("Nu");

        Structura sucursala1 = new Sucursala("La");
        Structura sucursala2 = new Sucursala("Ba");

        Structura agentie = new Agentie("Top");

        try {
            agentie.adaugaNod(sucursala1);
            agentie.adaugaNod(sucursala2);

            sucursala1.adaugaNod(filiala1);
            //sucursala2.adaugaNod(filiala2);

            agentie.afiseazaDetalii();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}