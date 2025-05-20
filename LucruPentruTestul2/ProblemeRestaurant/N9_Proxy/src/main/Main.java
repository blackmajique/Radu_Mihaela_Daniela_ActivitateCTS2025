package main;

//    B.9. Managerul restaurantului dorește ca atunci când cineva
//    dorește să realizez e o rezervare sa fie permisă doar dacă
//    aceasta este realizată pentru minim 4 persoane. În sens
//    contrar rezervarea nu este realizata, iar persoanele sunt
//    rugate să se prezinte la restaurant deoarece sunt suficiente
//    locuri pentru mesele de doua persoane. Sa se realizeze un nivel
//    intermediar care sa condiționeze realizarea rezervărilor de
//    numărul de persoane.

import clase.IRezervare;
import clase.Rezervare;
import clase.VerificareOraRezervare;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare = new Rezervare();

        IRezervare rezervareNrPersoane = new VerificareOraRezervare(rezervare);
        
        rezervareNrPersoane.rezerva("20.08.2025", "17:00", "Daniel", 5);
        rezervareNrPersoane.rezerva("20.09.2025", "17:00", "Daniel", 3);

    }
}