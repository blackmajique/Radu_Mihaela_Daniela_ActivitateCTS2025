package ro.cts.clase;

public class Calator {
    private String nume;
    private float distantaDeParcurs;

    public Calator(String nume, float distantaDeParcurs) {
        this.nume = nume;
        this.distantaDeParcurs = distantaDeParcurs;
    }

    public float getDistantaDeParcurs() {
        return distantaDeParcurs;
    }
}
