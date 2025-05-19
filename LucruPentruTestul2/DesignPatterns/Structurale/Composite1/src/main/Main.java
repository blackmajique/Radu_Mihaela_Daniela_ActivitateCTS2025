package main;

//A.8. Este dorita reprezentarea departamentelor spitalului in cadrul aplicației. Fiecare departament
//conține subdepartamente sau secții. Secțiile nu conțin subsecții. Sa se implementeze
//modulul care permite reprezentarea arborescenta a departamentelor si secțiilor spitalului.

import clase.Departament;
import clase.IStructura;
import clase.Sectie;

public class Main {
    public static void main(String[] args) {
        IStructura departament1 = new Departament("General", 100);
        IStructura departament2 = new Departament("CTI", 50);
        IStructura departament3 = new Departament("ICU", 20);

        IStructura sectie1 = new Sectie("Terapie intensiva");
        IStructura sectie2 = new Sectie("Cardiologie");
        IStructura sectie3 = new Sectie("Radiologie");

        try {
            departament1.adaugareStructura(departament2);
            departament1.adaugareStructura(departament3);

            departament1.adaugareStructura(sectie2);
            departament2.adaugareStructura(sectie2);
            departament3.adaugareStructura(sectie3);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        departament1.afisareDescriere();
    }
}