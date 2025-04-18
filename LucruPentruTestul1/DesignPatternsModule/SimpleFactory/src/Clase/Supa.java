package Clase;

public abstract class Supa {
    private final float cantitate;
    private final float pret;
    private final boolean areSmantana;

    public Supa(float cantitate, float pret, boolean areSmantana) {
        this.cantitate = cantitate;
        this.pret = pret;
        this.areSmantana = areSmantana;
    }

    public abstract void preparareSupa();

    public float calcularePretSupa() {
        return this.cantitate * this.pret / 10;
    }

    public float getCantitate() {
        return cantitate;
    }

    public float getPret() {
        return pret;
    }

    public boolean isAreSmantana() {
        return areSmantana;
    }
}
