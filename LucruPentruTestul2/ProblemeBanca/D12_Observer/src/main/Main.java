package main;

//    12. Banca dorește să anunțe toți clienții abonați la notificări.
//    Să se implementeze funcționalitatea de a trimite notificări
//    clienților abonați. Acest proces se realizează pentru toți
//    clienții băncii abonați la notificări.

import clase.Banca;
import clase.Clienti;
import clase.Observer;
import clase.Subject;

public class Main {
    public static void main(String[] args) {
        Observer client1 = new Clienti();
        Observer client2 = new Clienti();
        Observer client3 = new Clienti();

        Subject banca = new Banca();

        banca.adaugaObserver(client1);
        banca.adaugaObserver(client2);

        banca.trimiteNotificare("Hopaa ai primit un sms");
    }
}