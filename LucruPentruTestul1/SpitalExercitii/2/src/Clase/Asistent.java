package Clase;

public class Asistent extends Personal {
    private int nrPacientiPeZi;

    public Asistent(String nume, float salariu, float sporDeMunca, boolean areBonuriDeMasa, int nrPacientiPeZi) {
        super(nume, salariu, sporDeMunca, areBonuriDeMasa);
        this.nrPacientiPeZi = nrPacientiPeZi;
    }


    @Override
    public void datePersonal() {
        System.out.println("Persoana " + getNume() + " cu postul de asistent, are salariul "
                + calculSporDeMuncaLaSalariu() + " si lucreaza cu " + nrPacientiPeZi + " pacienti pe zi.");
    }
}
