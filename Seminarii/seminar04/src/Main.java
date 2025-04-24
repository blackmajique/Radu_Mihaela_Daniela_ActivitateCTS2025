//B. Restaurant
//B.1. Restaurantul servește mai multe tipuri de supe: supă de legume, supă de ciuperci,
//supă de vită, etc. Să se implementeze modulul care permite realizarea de obiecte din
//familia supelor. Tipurile de supă sunt reținute în cadrul unui enum.

//B.4. Restaurantul dorește să implementeze un modul în cadrul aplicației,
// astfel încât dacă un client a mai fost la restaurant și revine pentru a
// realiza o rezervare să nu fie necesară reconstruirea unui cont
// respectivului client, deoarece construirea unui nou obiect durează
// foarte mult si solicita mai multe date.


import ro.cts.seminar04.Factory.clase.Supa;
import ro.cts.seminar04.Factory.factory.Factory;
import ro.cts.seminar04.Factory.factory.TipuriSupe;
import ro.cts.seminar04.Prototype.clase.ARezervare;
import ro.cts.seminar04.Prototype.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory(300, 5);
        Supa supa = factory.getSupa(TipuriSupe.CIUPERCI, "ciuperci, cartofi, bors", 100);
        supa.preparareSupa();

        Supa supa1 = factory.getSupa(TipuriSupe.VITA, "vita, cartofi, smantana, ardei, morcovi", 200);
        supa1.preparareSupa();

        Supa suma2 = factory.getSupa(TipuriSupe.LEGUME, "lei, cartofi, bors", 100);
        suma2.preparareSupa();

        ARezervare rezervare = new Rezervare("daria maria", 10, "21.10.2023", "14:00");
        ARezervare rezervare2 = rezervare.copiaza();
        System.out.println(
                rezervare2.toString()
        );




    }
}