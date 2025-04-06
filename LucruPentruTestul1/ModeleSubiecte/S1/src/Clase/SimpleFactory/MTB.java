package Clase.SimpleFactory;

import Clase.Builder.Bicicleta;

public class MTB extends Bicicleta {
    private float pret;

    public MTB(int diametruRoti, String tipFrana, boolean cascaProtectie, boolean ochelari, float pret) {
        super(diametruRoti, tipFrana, cascaProtectie, ochelari);
        this.pret = pret;
    }

    @Override
    public void descriere() {
        super.descriere();
        System.out.println("Bicicleta MTB are pretul de " + pret);
    }
}
