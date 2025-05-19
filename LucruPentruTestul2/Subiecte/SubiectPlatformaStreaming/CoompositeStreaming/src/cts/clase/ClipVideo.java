package cts.clase;

import java.security.spec.ECField;

public class ClipVideo implements IClip {
    private String nume;
    private float durata;
    private String gen;
    private int vizionari;

    public ClipVideo(String nume, float durata, String gen, int vizionari) {
        this.nume = nume;
        this.durata = durata;
        this.gen = gen;
        this.vizionari = vizionari;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("CLipul video este despre " + nume +
                " are " + durata + " minute" +
                " este genul " + gen +
                " are nr de vizionari " + vizionari);
    }

    @Override
    public void adaugaClip(IClip clip) throws Exception{
        throw new Exception("Nu este implementat");
    }

    @Override
    public void stergeClip(IClip clip) throws Exception {
        throw new Exception("Nu este implementat");
    }

    @Override
    public IClip getClip(int cheie) throws Exception{
        throw new Exception("Nu este implementat");
    }

    @Override
    public String toString() {
        return "ClipVideo{" +
                "nume='" + nume + '\'' +
                ", durata=" + durata +
                ", gen='" + gen + '\'' +
                ", vizionari=" + vizionari +
                '}';
    }
}
