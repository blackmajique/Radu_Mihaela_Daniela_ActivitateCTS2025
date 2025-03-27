package ro.cts.seminar05.FactoryMethod.Clase;

public class Medic extends Angajat{
    private double spor;

    public Medic(String nume, Double salariu, double spor) {
        super(nume, salariu);
        this.spor = spor;
    }
}
