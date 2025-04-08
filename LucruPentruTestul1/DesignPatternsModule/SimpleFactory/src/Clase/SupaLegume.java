package Clase;

public class SupaLegume extends Supa{
    private final boolean areCartofi;

    public SupaLegume(float cantitate, float pret, boolean areSmantana, boolean areCartofi) {
        super(cantitate, pret, areSmantana);
        this.areCartofi = areCartofi;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de legume " + super.getCantitate() + " costa " + super.calcularePretSupa());
    }
}
