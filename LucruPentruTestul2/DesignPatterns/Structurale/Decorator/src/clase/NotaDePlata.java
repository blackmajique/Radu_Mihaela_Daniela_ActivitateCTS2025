package clase;

public class NotaDePlata implements NodaPlata {
    public float totalDePlata;

    public NotaDePlata(float totalDePlata) {
        this.totalDePlata = totalDePlata;
    }

    @Override
    public void printareMesaj() {
        System.out.println("Aveti de platit " + totalDePlata + " lei.");
    }
}
