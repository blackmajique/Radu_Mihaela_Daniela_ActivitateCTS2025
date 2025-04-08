package Clase;

public abstract class Angajat {
    private final String nume;
    private final Double salariu;

    public Angajat(String nume, Double salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "nume='" + nume + '\'' +
                ", salariu=" + salariu +
                '}';
    }
}
