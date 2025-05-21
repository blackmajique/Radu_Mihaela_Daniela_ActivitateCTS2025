package main;

//    A.11. Este dorită implementarea modului de plată pentru
//    pacienții care au fost internați în spital. Modul
//    de plată îl decide persoana care plătește în momentul
//    în care trebuie să facă plata. Plata se poate realiza
//    cu cardul sau cash. Sa se implementeze modulul de plata.

import clase.ModPlata;
import clase.Pacient;
import clase.PlataCard;
import clase.PlataCash;

public class Main {
    public static void main(String[] args) {
        ModPlata plataCash = new PlataCash();
        ModPlata plataCard = new PlataCard();

        Pacient pacient = new Pacient("Dan");

        pacient.setModPlata(plataCard);
        pacient.realizeazaPlata();

        pacient.setModPlata(plataCash);
        pacient.realizeazaPlata();
    }
}