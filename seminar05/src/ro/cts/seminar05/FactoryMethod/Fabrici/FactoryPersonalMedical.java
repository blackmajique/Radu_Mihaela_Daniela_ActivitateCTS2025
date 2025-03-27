package ro.cts.seminar05.FactoryMethod.Fabrici;

import ro.cts.seminar05.FactoryMethod.Clase.Angajat;
import ro.cts.seminar05.FactoryMethod.Clase.Asistent;
import ro.cts.seminar05.FactoryMethod.Clase.Medic;

import static ro.cts.seminar05.FactoryMethod.Fabrici.TipPersonalMedical.ASISTENT;
import static ro.cts.seminar05.FactoryMethod.Fabrici.TipPersonalMedical.MEDIC;

public class FactoryPersonalMedical implements FactoryPersonal {
    private double spor;

    public FactoryPersonalMedical(double spor) {
        this.spor = spor;
    }

    public void setSpor(double spor) {
        this.spor = spor;
    }

    @Override
    public Angajat creareAngajat(TipPersonal tipPersonal, String nume, double salariu) {
        return switch (tipPersonal) {
            case ASISTENT -> new Asistent(nume, salariu, spor);
            case MEDIC -> new Medic(nume, salariu, spor);
            case null, default -> null;
        };
    }
}
