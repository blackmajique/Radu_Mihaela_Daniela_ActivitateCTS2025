package Clase.Builder;

public class BicicletaBuilder implements IBuilder {
    private int diametruRoti;
    private String tipFrana;
    private boolean cascaProtectie;
    private boolean ochelari;

    public BicicletaBuilder() {
        this.diametruRoti = 16;
        this.cascaProtectie = true;
    }

    public BicicletaBuilder setDiametruRoti(int diametruRoti) {
        this.diametruRoti = diametruRoti;
        return this;
    }

    public BicicletaBuilder setTipFrana(String tipFrana) {
        this.tipFrana = tipFrana;
        return this;
    }

    public BicicletaBuilder setCascaProtectie(boolean cascaProtectie) {
        this.cascaProtectie = cascaProtectie;
        return this;
    }

    public BicicletaBuilder setOchelari(boolean ochelari) {
        this.ochelari = ochelari;
        return this;
    }

    @Override
    public Bicicleta build() {
        Bicicleta bicicleta = new Bicicleta(diametruRoti, tipFrana, cascaProtectie, ochelari);
        return bicicleta;
    }
}
