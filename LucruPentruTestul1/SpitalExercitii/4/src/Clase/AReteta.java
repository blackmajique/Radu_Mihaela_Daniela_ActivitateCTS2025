package Clase;

import java.util.ArrayList;
import java.util.List;

public abstract class AReteta {
    protected String numeMedicament;
    protected List<Ingredient> listaIngrediente;

    public AReteta(String numeMedicament, List<Ingredient> listaIngrediente) {
        if(numeMedicament.length() <= 2) {
            this.numeMedicament = "Necunoscut";
        } else {
            this.numeMedicament = numeMedicament;
        }

        if(listaIngrediente.size() == 0) {
            this.listaIngrediente = null;
        }
        else{
            this.listaIngrediente = listaIngrediente;
        }
    }

    public AReteta() {
        this.numeMedicament = "Necunoscut";
        this.listaIngrediente = null;
    }

    @Override
    public String toString() {
        return "AReteta{" +
                "numeMedicament='" + numeMedicament + '\'' +
                ", listaIngrediente=" + listaIngrediente +
                '}';
    }

    public abstract void descriereMedicament();

    public abstract AReteta copiaza();
}
