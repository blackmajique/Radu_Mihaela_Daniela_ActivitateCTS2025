package Builder;

public class BicicletaBuilder implements IBicicleta{

    private float diametruRoti;
    private String tipFrana;
    private boolean areCascaDeProtectie;
    private boolean areOchelari;

    public BicicletaBuilder setDiametruRoti(float diametruRoti) {
        this.diametruRoti = diametruRoti;
        return this;
    }

    public BicicletaBuilder setTipFrana(String tipFrana) {
        this.tipFrana = tipFrana;
        return this;
    }

    public BicicletaBuilder setAreCascaDeProtectie(boolean areCascaDeProtectie) {
        this.areCascaDeProtectie = areCascaDeProtectie;
        return this;
    }

    public BicicletaBuilder setAreOchelari(boolean areOchelari) {
        this.areOchelari = areOchelari;
        return this;
    }

    @Override
    public Bicicleta build() {
        Bicicleta bicicleta = new Bicicleta(diametruRoti, tipFrana, areCascaDeProtectie, areOchelari);
        return bicicleta;
    }
}
