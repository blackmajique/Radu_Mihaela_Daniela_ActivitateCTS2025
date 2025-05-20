package main;

//F.7. Compania doreste ca modulul de printare al biletelor sa permita cu ocazia
//anumitor zile nationale sa printeze pe bilet un mesaj de "La multi ani".
//Se doreste implementarea acestui modul care sa adauge functionalitatea
//de printare mesaj customizat. Exista posibilit                                                                                                                                                                                                                                                                                                                                                                                                                                  atea ca aceasta
//functionalitate sa nu fie folosita, si din acest motiv se doreste sa
//        fie optionala, fara modificarea codului existent.

import clase.BiletSarbatori;
import clase.BiletSimplu;
import clase.IBilet;

public class Main {
    public static void main(String[] args) {
        IBilet bilet1 = new BiletSimplu(4.3f, "Daria");
        IBilet bilet2 = new BiletSarbatori(bilet1);

        bilet2.afisareDetaliiBilet();
    }
}