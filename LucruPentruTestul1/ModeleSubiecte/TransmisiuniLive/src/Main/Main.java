package Main;
//    3p. Ați creat o aplicație mobilă ce vă permite să transmiteți live evenimente sportive. Realizați faptul
//    că cu cât evenimentul este transmis live pe mai multe platforme, cu atât durează mai mult să porniți
//    live-ul, cu toate că feed-ul live este același. Știind că o transmisiune live implementează interfața
//    Live, utilizați un design pattern ce rezolvă problema de performanță. Țineți cont și de faptul că odată
//    create, transmisiunile live pot avea detalii diferite (exemplu: altă listă de comentarii).
//            1.5p. Testați implementarea prin crearea a 3 transmisiuni live aferente aceluiași eveniment sportiv pe
//    3 platforme de streaming diferite. Demonstrați faptul că adăugarea unui comentariu pe una dintre
//    platforme nu va face ca acesta să apară pe altă platformă.
//    3p. Aplicația permite transmisiuni live pentru 3 sporturi diferite: fotbal, baschet și handbal. Utilizați un
//    design pattern ce permite crearea transmisiunii în funcție de tipul de sport știind că toate tipurile de
//    sport deriveaza clasa abstractă Sport și că sportul este ales la momentul execuției programului
//    împreună cu numele echipelor (echipa gazdă și echipa oaspete). Luați în calcul și faptul că pe viitor
//    se dorește implementarea altor categorii de sporturi, iar acest lucru nu trebuie să afecteze/modifice
//    implementarea curentă.
//            1.5p. Testați în main implementarea prin crearea a minim 3 transmisiuni pentru sporturi diferite.
//    Utilizați o modalitate de evita referințele la clase concrete în metoda principală.

import FactoryMethod.Clase.Sport;
import FactoryMethod.FactoryMethod.BaschetFactory;
import FactoryMethod.FactoryMethod.HandbalFactory;
import FactoryMethod.FactoryMethod.SportFactory;
import Prototype.TransmisiuneLive;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaComentarii = new ArrayList<>();
        listaComentarii.add("Comentariu 1");
        listaComentarii.add("Comentariu 2");

        TransmisiuneLive transmisiuneLive = new TransmisiuneLive("Netflix", 6000, listaComentarii);
        transmisiuneLive.startTransmisiuneLive();

        TransmisiuneLive transmisiuneLive1 = new TransmisiuneLive("HBO", 6000, listaComentarii);
        transmisiuneLive1.startTransmisiuneLive();

        SportFactory factory = new BaschetFactory();
        Sport sport = factory.createSport("JAJA", "Xaxa", transmisiuneLive);
        sport.afiseazaDetaliiDespreSport();

        SportFactory factory1 = new HandbalFactory();
        Sport sport1 = factory1.createSport("Koala", "Maimuta", transmisiuneLive);
        sport1.afiseazaDetaliiDespreSport();

    }
}