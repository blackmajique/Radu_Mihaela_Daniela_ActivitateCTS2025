package main;

//    B.14. Ocuparea unei mese in restaurant se face după următorii pași:
//    Se curata masa, Se așază șervetele, Se așază tacâmuri, sunt invitate
//    persoanele sa se așeze la masa. Sa se implementeze modului care
//    realizează in aplicație ocuparea meselor din restaurant.

import clase.Masa;
import clase.Rezervare;
import clase.Template;

public class Main {
    public static void main(String[] args) {
        Template masa = new Masa(1, 4);

        Rezervare rezervare = new Rezervare("Marian", 4);
        masa.ocupaMasa(rezervare);

    }
}