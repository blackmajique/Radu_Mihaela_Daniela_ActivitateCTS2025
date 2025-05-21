package clase;

public class Calator {
    private String nume;
    private int pretBilet;
    private ModalitatePlata modalitatePlata;

    public Calator(String nume, int pretBilet) {
        this.nume = nume;
        this.pretBilet = pretBilet;
        this.modalitatePlata = modalitatePlata;
    }

    public Calator(String nume, int pretBilet, ModalitatePlata modalitatePlata) {
        this.nume = nume;
        this.pretBilet = pretBilet;
        this.modalitatePlata = modalitatePlata;
    }

    public void setModalitatePlata(ModalitatePlata modalitatePlata) {
        this.modalitatePlata = modalitatePlata;
    }

    public void realizeazaPlata() {
        modalitatePlata.realizeazaPlata();
    }
}
