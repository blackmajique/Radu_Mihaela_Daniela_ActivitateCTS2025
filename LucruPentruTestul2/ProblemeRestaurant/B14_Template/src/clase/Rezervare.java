package clase;

public class Rezervare {
    private String nume;
    private int nrPersoane;

    public Rezervare(String nume, int nrPersoane) {
        this.nume = nume;
        this.nrPersoane = nrPersoane;
    }

    public String getNume() {
        return nume;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }
}
