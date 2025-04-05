package Clase;

public abstract class Personal {
    private String nume;
    private float salariu;
    private float sporDeMunca;
    private boolean areBonuriDeMasa;

    public Personal(String nume, float salariu, float sporDeMunca, boolean areBonuriDeMasa) {
        this.nume = nume;
        this.salariu = salariu;
        this.sporDeMunca = sporDeMunca;
        this.areBonuriDeMasa = areBonuriDeMasa;
    }

    public abstract void datePersonal();

    public float calculSporDeMuncaLaSalariu() {
        return salariu + sporDeMunca;
    }

    public String getNume() {
        return nume;
    }

    public float getSalariu() {
        return salariu;
    }

    public float getSporDeMunca() {
        return sporDeMunca;
    }

    public boolean isAreBonuriDeMasa() {
        return areBonuriDeMasa;
    }
}
