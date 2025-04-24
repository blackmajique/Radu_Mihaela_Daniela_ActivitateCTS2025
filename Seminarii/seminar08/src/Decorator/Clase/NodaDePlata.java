package Decorator.Clase;

public class NodaDePlata implements NotaP {
    private float totalDePlata;

    public NodaDePlata(float totalDePlata) {
        this.totalDePlata = totalDePlata;
    }

    public void printare() {
        System.out.println("Aveti de platit " + totalDePlata + " lei.");
    }

}
