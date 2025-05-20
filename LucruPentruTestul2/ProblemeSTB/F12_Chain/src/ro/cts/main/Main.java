package ro.cts.main;

//F.12. Trebuie implementat un modul care sa ii spuna calatorului ce mijloc de transport trebuie sa
//foloseasca in functie de distanta pe care o are de parcurs. Astfel, daca un calator are de parcurs o
//distanta mai mica de 3 km, este recomandat sa mearga cu Troleibuzul. Daca are o distanta cuprinsa
//intre 3 si 5 km i se recomanda sa foloseasca autobuzul, iar daca are o distanta cuprinsa intre 5 km
//si 10 km, i se recomanda sa foloseasca Tramvaiul. In cazul in care distanta este mai mare decat 10
//km i se recomanda sa foloseasca Metroul. Sa se implementeze acest modul in cadrul aplicatiei.

import ro.cts.clase.Autobuz;
import ro.cts.clase.Calator;
import ro.cts.clase.MijlocTransport;
import ro.cts.clase.Troleibuz;

public class Main {
    public static void main(String[] args) {
        MijlocTransport troleibuz = new Troleibuz();
        MijlocTransport autobuz = new Autobuz();

        troleibuz.setMijlocTransport(autobuz);

        Calator calator1 = new Calator("Maria", 4);
        Calator calator2 = new Calator("Maria", 1);
        troleibuz.notificaCalator(calator1);
        troleibuz.notificaCalator(calator2);
    }
}