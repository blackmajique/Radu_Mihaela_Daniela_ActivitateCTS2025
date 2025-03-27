package ro.cts.seminar05.FactoryMethod.Clase;

public class Asistent extends Angajat{
    private double spor;

    public Asistent(String nume, Double salariu, double spor) {
        super(nume, salariu);
        this.spor = spor;
    }
}
