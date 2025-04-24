package Proxy.Main;

// B.9. Managerul restaurantului dorește ca atunci când cineva
// dorește să realizez e o rezervare sa fie permisă doar
// dacă aceasta este realizată pentru minim 4 persoane.
// În sens contrar rezervarea nu este realizata, iar
// persoanele sunt rugate să se prezinte la restaurant
// deoarece sunt suficiente locuri pentru mesele de
// doua persoane. Sa se realizeze un nivel intermediar
// care sa condiționeze realizarea rezervărilor de numărul de persoane.

import Proxy.Clase.IRezervare;
import Proxy.Clase.ProxyNumarPersoane;
import Proxy.Clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare = new Rezervare();
        rezervare.rezerva("Maria", 2, 20);

        IRezervare rezervare2 = new ProxyNumarPersoane(rezervare);
        rezervare2.rezerva("Maria", 2, 20);
    }
}
