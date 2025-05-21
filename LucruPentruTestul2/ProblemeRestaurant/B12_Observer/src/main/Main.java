package main;
//    B.12. Restaurantul dorește să anunțe clienții
//    fideli ori de câte ori apar noi oferte. Astfel
//    se dorește implementarea unui modul care atunci
//    când se realizează o ofertă de preț sau se introduce
//    un nou meniu să se trimită notificări tuturor clienților
//    abonați la notificările restaurantului.

import clase.Client;
import clase.Notificare;
import clase.Observer;
import clase.Subject;

public class Main {
    public static void main(String[] args) {
        Observer client1 = new Client("Maria");
        Observer client2 = new Client("Ana");
        Observer client3 = new Client("Marius");

        Subject listaClienti = new Notificare();
        listaClienti.adaugaObservabile(client1);
        listaClienti.adaugaObservabile(client2);
        listaClienti.adaugaObservabile(client3);

        listaClienti.trimiteMesaj("Oferta!!! 10% reducere la orice pizza");
    }
}