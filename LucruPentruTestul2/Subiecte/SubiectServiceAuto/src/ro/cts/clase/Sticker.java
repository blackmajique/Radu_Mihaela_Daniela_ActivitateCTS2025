package ro.cts.clase;

public class Sticker {
    private final String model;
    private final int an;
    private final String dimensiuni;

    public Sticker(String model, int an, String dimensiuni) {
        this.model = model;
        this.an = an;
        this.dimensiuni = dimensiuni;
    }

    public void afiseaza() {
        System.out.println("Sticker pentru " + model + ", an " + an + ", dimensiuni: " + dimensiuni);
    }
}
