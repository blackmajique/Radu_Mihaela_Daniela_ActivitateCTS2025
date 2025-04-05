package Clase;

public class SimpleFactory {
    private String nume;
    private float salariu;
    private float sporDeMunca;
    private boolean areBonuriDeMasa;

    public SimpleFactory(String nume, float salariu, float sporDeMunca, boolean areBonuriDeMasa) {
        this.nume = nume;
        this.salariu = salariu;
        this.sporDeMunca = sporDeMunca;
        this.areBonuriDeMasa = areBonuriDeMasa;
    }

    public Personal getPersonal(PersonalSpital personalSpital, int nrCevaPeZi) {
        switch (personalSpital) {
            case ASISTENT:
                Asistent asistent = new Asistent(nume, salariu, sporDeMunca, areBonuriDeMasa, nrCevaPeZi);
                return asistent;
            case MEDIC:
                Medic medic = new Medic(nume, salariu, sporDeMunca, areBonuriDeMasa, nrCevaPeZi);
                return medic;
            case BRANCARDIER:
                Brancardier brancardier = new Brancardier(nume, salariu, sporDeMunca, areBonuriDeMasa, nrCevaPeZi);
                return brancardier;
                default:
                    return null;
        }
    }
}
