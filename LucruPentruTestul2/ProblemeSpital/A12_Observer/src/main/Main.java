package main;

//    A.12. Spitalul dorește să anunțe toți pacienții care
//    au fost în spital ori de câte ori apare vreo urgență
//    cu privire la viruși existenți în oraș. Astfel se dorește
//    implementarea unui modul care atunci când apare o epidemie
//    sau un virus nou să se trimită notificări tuturor persoanelor
//    abonate la notificările spitalului.

import clase.BazaDeDatePacienti;
import clase.Observer;
import clase.Pacient;

public class Main {
    public static void main(String[] args) {
        Observer pacient1 = new Pacient("Pacient1");
        Observer pacient2 = new Pacient("Pacient2");
        Observer pacient3 = new Pacient("Pacient3");

        BazaDeDatePacienti listaPacienti = new BazaDeDatePacienti();
        listaPacienti.adaugaObservabil(pacient1);
        listaPacienti.adaugaObservabil(pacient2);
        listaPacienti.adaugaObservabil(pacient3);

        listaPacienti.trimiteMesaj("virus corona");
    }
}