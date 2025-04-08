package ro.cts.seminar04.Factory.clase;

public abstract class Supa {

    private final int gramaj;
    private final double pretPerSutaDeGrame;
    private final String ingrediente;

    public Supa(int gramaj, double pretPerSutaDeGrame, String ingrediente) {
        this.gramaj = gramaj;
        this.pretPerSutaDeGrame = pretPerSutaDeGrame;
        this.ingrediente = ingrediente;
    }

    public abstract void preparareSupa();

    public double calculPret(){
        return pretPerSutaDeGrame * gramaj / 100;
    }

    public int getGramaj() {
        return gramaj;
    }

    public double getPretPerSutaDeGrame() {
        return pretPerSutaDeGrame;
    }

    public String getIngrediente() {
        return ingrediente;
    }
}
