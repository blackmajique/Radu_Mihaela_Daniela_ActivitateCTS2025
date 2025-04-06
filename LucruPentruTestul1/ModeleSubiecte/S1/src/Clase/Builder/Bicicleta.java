package Clase.Builder;

import Clase.SimpleFactory.IBicicleta;

public class Bicicleta implements IBicicleta {
    private final int diametruRoti;
    private final String tipFrana;
    private final boolean cascaProtectie;
    private final boolean ochelari;


    protected Bicicleta(int diametruRoti, String tipFrana, boolean cascaProtectie, boolean ochelari) {
        this.diametruRoti = diametruRoti;
        this.tipFrana = tipFrana;
        this.cascaProtectie = cascaProtectie;
        this.ochelari = ochelari;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "diametruRoti=" + diametruRoti +
                ", tipFrana='" + tipFrana + '\'' +
                ", cascaProtectie=" + cascaProtectie +
                ", ochelari=" + ochelari +
                '}';
    }

    public int getDiametruRoti() {
        return diametruRoti;
    }

    public String getTipFrana() {
        return tipFrana;
    }

    public boolean isCascaProtectie() {
        return cascaProtectie;
    }

    public boolean isOchelari() {
        return ochelari;
    }

    @Override
    public void descriere() {
        System.out.println("Bicicleta are diametrul rotilor de " + diametruRoti + ", frana este "
        + tipFrana);
    }
}
