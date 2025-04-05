package Clase;

public class Brancardier extends Personal{
    private int nrOreDeLucruPeSaptamana;

    public Brancardier(String nume, float salariu, float sporDeMunca, boolean areBonuriDeMasa, int nrOreDeLucruPeSaptamana) {
        super(nume, salariu, sporDeMunca, areBonuriDeMasa);
        this.nrOreDeLucruPeSaptamana = nrOreDeLucruPeSaptamana;
    }


    @Override
    public void datePersonal() {
        System.out.println("Persoana " + getNume() + " cu postul de brancardier, are salariul "
        + calculSporDeMuncaLaSalariu() + " si lucreaza " + nrOreDeLucruPeSaptamana + " ore pe saptamana.");
    }


}
