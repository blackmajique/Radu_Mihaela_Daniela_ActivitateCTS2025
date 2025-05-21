package main;

//    F.10. Un calator are posibilitatea sa plateasca cu cardul
//            de calatorii, cardul bancar sau prin SMS. Trebuie
//    implementat modulul dintr-un validator calatorie care sa
//    permita plata calatoriei printruna din cele trei metode.
//    Calatorul va decide modul de plata atunci cand se urca
//    in mijlocul de transport.

import clase.Calator;
import clase.ModalitatePlata;
import clase.PlataCard;
import clase.PlataSMS;

public class Main {
    public static void main(String[] args) {
        ModalitatePlata plataCard = new PlataCard();
        ModalitatePlata plataSMS = new PlataSMS();

        Calator calator = new Calator("Marius", 3, plataCard);
        calator.realizeazaPlata();
    }
}