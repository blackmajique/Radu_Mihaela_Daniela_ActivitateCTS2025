package Clase;

public class SupaCiuperci extends Supa{
    private final float gramajCiuperci;
    private final float pretCiuperci;

    public SupaCiuperci(float cantitate, float pret, boolean areSmantana, float pretCiuperci, float gramajCiuperci) {
        super(cantitate, pret, areSmantana);
        this.gramajCiuperci = gramajCiuperci;
        this.pretCiuperci = pretCiuperci;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de ciuperci contine " + gramajCiuperci + " grame ciuperci si costa " + calcularePretSupa());
    }

    @Override
    public float calcularePretSupa() {
        return super.calcularePretSupa() + gramajCiuperci * pretCiuperci / 100;
    }
}
