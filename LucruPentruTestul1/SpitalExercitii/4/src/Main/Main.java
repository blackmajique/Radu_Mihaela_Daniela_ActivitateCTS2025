package Main;

import Clase.AReteta;
import Clase.Ingredient;
import Clase.Reteta;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ingredient> ingrediente = Arrays.asList(
                new Ingredient("Amoxicilina", 500),
                new Ingredient("Apa distilata", 200),
                new Ingredient("Zahar", 50)
        );

        AReteta retetaOriginala = new Reteta("Reteta Amoxicilina", ingrediente);

        retetaOriginala.descriereMedicament();

        AReteta retetaCopiata = retetaOriginala.copiaza();

        System.out.println("\nReteta copiata:");
        retetaCopiata.descriereMedicament();
    }
}