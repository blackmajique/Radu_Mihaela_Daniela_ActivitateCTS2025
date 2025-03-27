package ro.cts.seminar05.FactoryMethod.Clase;

public class Portar extends Angajat {
    private int vechime;

    public Portar(String nume, Double salariu, int vechime) {
        super(nume, salariu);
        this.vechime = vechime;
    }
}
