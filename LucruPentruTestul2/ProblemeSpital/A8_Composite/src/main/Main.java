package main;

//A.8. Este dorita reprezentarea departamentelor spitalului in cadrul
//aplicației. Fiecare departament conține subdepartamente sau secții.
//Secțiile nu conțin subsecții. Sa se implementeze modulul care
//permite reprezentarea arborescenta a departamentelor si secțiilor spitalului.

import clase.Departament;
import clase.Structura;
import clase.Subdepartament;

public class Main {
    public static void main(String[] args) throws Exception {
        Structura subdepartament1 = new Subdepartament("Subdepartament1", 12);
        Structura subdepartament2 = new Subdepartament("Subdepartament2", 20);
        Structura subdepartament3 = new Subdepartament("Subdepartament3", 30);

        Structura departament1 = new Departament("Departament1", 123);
        Structura departament2 = new Departament("Departament2", 214);

        try {
            departament1.adaugaStructura(subdepartament1);
            departament1.adaugaStructura(subdepartament2);

            departament2.adaugaStructura(subdepartament3);

            departament1.printareStructura();
            departament2.printareStructura();

            departament1.stergeStructura(subdepartament2);
            departament1.printareStructura();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}