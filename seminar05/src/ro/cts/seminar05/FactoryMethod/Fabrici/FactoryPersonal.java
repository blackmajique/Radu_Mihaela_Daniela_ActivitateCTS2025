package ro.cts.seminar05.FactoryMethod.Fabrici;

import ro.cts.seminar05.FactoryMethod.Clase.Angajat;

public interface FactoryPersonal {

    Angajat creareAngajat(TipPersonal tipPersonal, String nume, double salariu);
}
