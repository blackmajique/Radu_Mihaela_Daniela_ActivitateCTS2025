package ro.cts.seminar05.FactoryMethod.Fabrici;

import ro.cts.seminar05.FactoryMethod.Clase.Angajat;
import ro.cts.seminar05.FactoryMethod.Clase.Asistent;
import ro.cts.seminar05.FactoryMethod.Clase.Medic;

import static ro.cts.seminar05.FactoryMethod.Fabrici.TipPersonalNonMedical.PORTAR;
import static ro.cts.seminar05.FactoryMethod.Fabrici.TipPersonalNonMedical.SECRETAR;

public class FactoryPersonalNonMedical implements FactoryPersonal {
    private int vechime;

    public FactoryPersonalNonMedical(int vechime) {
        this.vechime = vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    @Override
    public Angajat creareAngajat(TipPersonal tipPersonal, String nume, double salariu) {
        return switch (tipPersonal) {
            case PORTAR -> new Asistent(nume, salariu, vechime);
            case SECRETAR -> new Medic(nume, salariu, vechime);
            case null, default -> null;
        };
    }
}
