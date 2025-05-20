package clase;

public class Subdepartament implements Structura {
    private String numeDepartament;
    private int nrMedici;

    public Subdepartament(String numeDepartament, int nrMedici) {
        this.numeDepartament = numeDepartament;
        this.nrMedici = nrMedici;
    }

    @Override
    public void adaugaStructura(Structura s) throws Exception {
        throw new Exception("Nu este implementata");
    }

    @Override
    public void stergeStructura(Structura s) throws Exception{
        throw new Exception("Nu este implementata");
    }

    @Override
    public void printareStructura() {
        System.out.println("Subdeparatamnetul " + numeDepartament + " are un nr de medici de " + nrMedici );
    }

    @Override
    public Structura getStructura(int index) throws Exception{
        throw new Exception("Nu este implementata");
    }
}
