package Clase.SimpleFactory;

import Clase.Builder.Bicicleta;

public class Electrica extends Bicicleta {
    float oreBaterie;


    protected Electrica(int diametruRoti, String tipFrana, boolean cascaProtectie, boolean ochelari, float oreBaterie) {
        super(diametruRoti, tipFrana, cascaProtectie, ochelari);
        this.oreBaterie = oreBaterie;
    }
}
