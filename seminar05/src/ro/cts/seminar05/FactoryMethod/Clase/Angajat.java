package ro.cts.seminar05.FactoryMethod.Clase;

public abstract class Angajat {
    private String nume;
    private Double salariu;

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
