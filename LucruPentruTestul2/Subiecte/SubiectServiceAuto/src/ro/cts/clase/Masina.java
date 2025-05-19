package ro.cts.clase;

public class Masina implements IMasina {
    private final String model;
    private final int anFabricatie;

    public Masina(String model, int anFabricatie) {
        this.model = model;
        this.anFabricatie = anFabricatie;
    }

    public String getModel() {
        return model;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Mașină: " + model + ", an fabricație: " + anFabricatie);
    }
}
