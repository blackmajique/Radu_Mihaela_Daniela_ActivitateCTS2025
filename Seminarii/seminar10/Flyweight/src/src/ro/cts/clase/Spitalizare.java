package src.ro.cts.clase;

public class Spitalizare {
    private int numarSalon;
    private int numarPat;
    private int nrZileSpitalizare;

    public Spitalizare(int numarSalon, int numarPat, int nrZileSpitalizare) {
        this.numarSalon = numarSalon;
        this.numarPat = numarPat;
        this.nrZileSpitalizare = nrZileSpitalizare;
    }

    @Override
    public String toString() {
        return "Spitalizare{" +
                "numarSalon=" + numarSalon +
                ", numarPat=" + numarPat +
                ", nrZileSpitalizare=" + nrZileSpitalizare +
                '}';
    }
}
