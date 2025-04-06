package Clase.SimpleFactory;

import Clase.Builder.Bicicleta;

public class Trekking extends Bicicleta {
    private float costReparatie;

    protected Trekking(int diametruRoti, String tipFrana, boolean cascaProtectie, boolean ochelari, float costReparatie) {
        super(diametruRoti, tipFrana, cascaProtectie, ochelari);
        this.costReparatie = costReparatie;
    }
}
