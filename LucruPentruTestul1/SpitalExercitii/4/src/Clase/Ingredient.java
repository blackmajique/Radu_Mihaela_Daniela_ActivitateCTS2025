package Clase;

public class Ingredient {
    private String numeIngredient;
    private float cantitate;

    public Ingredient(String numeIngredient, float cantitate) {
        this.numeIngredient = numeIngredient;
        this.cantitate = cantitate;
    }

    public String getNumeIngredient() {
        return numeIngredient;
    }

    public void setNumeIngredient(String numeIngredient) {
        this.numeIngredient = numeIngredient;
    }

    public float getCantitate() {
        return cantitate;
    }

    public void setCantitate(float cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "numeIngredient='" + numeIngredient + '\'' +
                ", cantitate=" + cantitate +
                '}';
    }
}
