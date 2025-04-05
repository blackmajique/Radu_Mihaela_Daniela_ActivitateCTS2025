package Clase;

import java.util.List;

public class Reteta extends AReteta{

    public Reteta(String numeMedicament, List<Ingredient> listaIngrediente) {
        super(numeMedicament, listaIngrediente);
    }

    public Reteta() {
    }

    @Override
    public void descriereMedicament() {
        System.out.println("Reteta antibiotic: " + numeMedicament + " cu ingrediente:");
        for (Ingredient i : listaIngrediente) {
            System.out.println(" - " + i);
        }
    }

    @Override
    public AReteta copiaza() {
        Reteta reteta = new Reteta();

        reteta.numeMedicament = this.numeMedicament;
        reteta.listaIngrediente = this.listaIngrediente;

        return reteta;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "numeMedicament='" + numeMedicament + '\'' +
                ", listaIngrediente=" + listaIngrediente +
                '}';
    }
}
