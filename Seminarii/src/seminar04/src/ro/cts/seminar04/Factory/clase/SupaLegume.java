package ro.cts.seminar04.Factory.clase;

public class SupaLegume extends Supa{
    private final double gramajCrutoane;

    public SupaLegume(int gramaj, double pretPerSutaDeGrame, String ingrediente, double gramajCrutoane) {
        super(gramaj, pretPerSutaDeGrame, ingrediente);
        this.gramajCrutoane = gramajCrutoane;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de legume e buna cu smantana si " + gramajCrutoane + " grame de crutoane");
    }

    @Override
    public double calculPret() {
        return super.calculPret() + gramajCrutoane / 100 * getPretPerSutaDeGrame() * 2;
    }
}
