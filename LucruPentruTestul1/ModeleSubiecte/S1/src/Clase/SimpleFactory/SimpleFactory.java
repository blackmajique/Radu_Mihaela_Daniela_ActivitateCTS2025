package Clase.SimpleFactory;

import Clase.Builder.Bicicleta;

public class SimpleFactory {
    private final boolean cascaProtectie;
    private final boolean ochelari;

    public SimpleFactory(boolean cascaProtectie, boolean ochelari) {
        this.cascaProtectie = cascaProtectie;
        this.ochelari = ochelari;
    }

    public Bicicleta getBicicleta(Biciclete biciclete, int diametruRoti, String tipFrana, float extraInfo) {
        switch (biciclete){
            case MTB -> {
                return new MTB(diametruRoti, tipFrana, cascaProtectie, ochelari, extraInfo);
            }
            case ELECTRICA -> {
                return new Electrica(diametruRoti, tipFrana, cascaProtectie, ochelari, extraInfo);
            }
            case TREKKING -> {
                return new Trekking(diametruRoti, tipFrana, cascaProtectie, ochelari, extraInfo);
            }
            default -> {
                return null;
            }
        }
    }
}
