package clase;

public class Items implements Structura{
    private String numeItems;
    private float pret;

    public Items(String numeItems, float pret) {
        this.numeItems = numeItems;
        this.pret = pret;
    }

    @Override
    public void adaugaItem(Structura structura1, Structura structura2) throws Exception {
        throw new Exception("Nu este implementata");
    }

    @Override
    public void stergeItem(Structura structura1, Structura structura2) throws Exception{
        throw new Exception("Nu este implementata");
    }

    @Override
    public void printareStructura() {
        System.out.println("Avem ca bautura mai boring: " + numeItems + " si costa " + pret);
    }

    @Override
    public Structura getStructura(int index) throws Exception{
        throw new Exception("Nu este implementata");
    }
}
