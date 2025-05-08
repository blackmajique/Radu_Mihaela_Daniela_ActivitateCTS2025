package ro.cts.main;

import ro.cts.clase.Departament;
import ro.cts.clase.Sectie;
import ro.cts.clase.Structura;

//A.8. Este dorita reprezentarea departamentelor spitalului in cadrul aplicației. Fiecare departament
//conține subdepartamente sau secții. Secțiile nu conțin subsecții. Sa se implementeze
//modulul care permite reprezentarea arborescenta a departamentelor si secțiilor spitalului.

public class Main {
    public static void main(String[] args) {
        Structura departament1 = new Departament("General", 100);
        Structura departament2 = new Departament("CTI", 50);
        Structura departament3 = new Departament("ICU", 20);

        Structura sectie1 = new Sectie("Terapie intensiva");
        Structura sectie2 = new Sectie("Cardiologie");
        Structura sectie3 = new Sectie("Radiologie");

       try {
           departament1.adaugaStructura(departament2);
           departament1.adaugaStructura(departament3);

           departament1.adaugaStructura(sectie2);
           departament2.adaugaStructura(sectie2);
           departament3.adaugaStructura(sectie3);
       } catch (Exception e) {
           System.out.println(e.toString());
       }

       departament1.afiseazaDescriere();

    }
}