package cts.main;

//F.10. Un calator are posibilitatea sa plateasca cu cardul de calatorii, cardul bancar sau prin SMS.
//Trebuie implementat modulul dintr-un validator calatorie care sa permita plata calatoriei printruna
//din cele trei metode. Calatorul va decide modul de plata atunci cand se urca in mijlocul de
//transport.

import cts.clase.Calator;
import cts.clase.CardCalatorie;
import cts.clase.IMetodaPlata;
import cts.clase.PlataSMS;

public class Main {
    public static void main(String[] args) {
        IMetodaPlata metodaPlata = new CardCalatorie(5);
        Calator calator1 = new Calator("Daniela", metodaPlata);
        calator1.plateste(5);
        calator1.setMetodaPlata(new PlataSMS());
        calator1.plateste(5);
        calator1.setMetodaPlata(metodaPlata);
        calator1.plateste(5);
    }
}