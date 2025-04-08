package Clase;

public class Medic extends Angajat{
    private final double spor;

    public Medic(String nume, Double salariu, double spor) {
        super(nume, salariu);
        this.spor = spor;
    }
}
