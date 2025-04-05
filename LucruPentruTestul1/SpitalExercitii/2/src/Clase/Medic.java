package Clase;

public class Medic extends Personal {
    private int nrRetetePrescrisePeZi;

    public Medic(String nume, float salariu, float sporDeMunca, boolean areBonuriDeMasa, int nrRetetePrescrisePeZi) {
        super(nume, salariu, sporDeMunca, areBonuriDeMasa);
        this.nrRetetePrescrisePeZi = nrRetetePrescrisePeZi;
    }

    @Override
    public void datePersonal() {
        System.out.println("Persoana " + getNume() + " cu postul de medic, are salariul "
                + calculSporDeMuncaLaSalariu() + " si prescrie " + nrRetetePrescrisePeZi + " retete pe zi.");

    }
}
