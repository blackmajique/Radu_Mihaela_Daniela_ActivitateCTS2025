package ro.cts.seminar04.Factory.clase;

public class SupaVita extends Supa {
    private final double pretExtra;

    public SupaVita(int gramaj, double pretPerSutaDeGrame, String ingrediente, double pretSmantana) {
        super(gramaj, pretPerSutaDeGrame, ingrediente);
        this.pretExtra = pretSmantana;
    }

    @Override
    public double calculPret() {
        return super.calculPret() + pretExtra;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Yummy, supa de vita cu smantana care costa " + pretExtra + " lei.");
    }
}
