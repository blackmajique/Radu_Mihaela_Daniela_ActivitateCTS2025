package clase;

public class Sectie implements IStructura{
    private String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Descriere: " + nume);
    }

    @Override
    public void adaugareStructura(IStructura structura) throws Exception{
        System.out.println("Numele sectiei: " + nume);
    }

    @Override
    public void stergeStructura(IStructura structura) throws Exception {
        throw new Exception("Nu a fost implementata");
    }

    @Override
    public IStructura getStructura(int index) throws Exception {
        throw new Exception("Nu a fost implementata");
    }
}
