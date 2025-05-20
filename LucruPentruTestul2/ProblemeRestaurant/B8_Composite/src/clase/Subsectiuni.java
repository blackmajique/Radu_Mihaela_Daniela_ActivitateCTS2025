package clase;

public class Subsectiuni implements Structura{
    private String numeSubsectiune;

    public Subsectiuni(String numeSubsectiune) {
        this.numeSubsectiune = numeSubsectiune;
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
        System.out.println("Avem ca bautura mai fancy " + numeSubsectiune);
    }

    @Override
    public Structura getStructura(int index) throws Exception{
        throw new Exception("Nu este implementata");
    }
}
