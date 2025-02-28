package modele;

import interfete.iPersoana;

public abstract class Persoana implements iPersoana {
    private String nume;
    protected int varsta;

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public Persoana() {
        nume = "Anonim";
        varsta = 0;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public int getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public abstract float calculareVenit();
}
