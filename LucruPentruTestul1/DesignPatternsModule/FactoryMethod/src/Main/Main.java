package Main;

//A.3. În cadrul aplicației personalul spitalului este de mai multe tipuri: Brancardier, Asistent, Medic,
//Secretar, Registrator. Să se implementeze modulul care pune la dispoziției crearea de obiecte din
//familia obiectelor PersonalSpital stiind faptul ca personalul este împărțit in doua categorii:
//personal medical si personal non-Medical.

import Clase.Angajat;
import Fabrici.FactoryPersonalMedical;
import Fabrici.FactoryPersonalNonMedical;
import Fabrici.TipPersonalMedical;

public class Main {
    public static void main(String[] args) {

        FactoryPersonalMedical factoryPersonalMedical = new FactoryPersonalMedical(10.5);
        FactoryPersonalNonMedical factoryPersonalNonMedical = new FactoryPersonalNonMedical(10);
        Angajat medic = factoryPersonalNonMedical.creareAngajat(TipPersonalMedical.MEDIC, "medic", 10000);
        factoryPersonalMedical.setSpor(15);
        Angajat asistent = factoryPersonalNonMedical.creareAngajat(TipPersonalMedical.ASISTENT, "asistent", 5000);
        factoryPersonalMedical.setSpor(10);


    }
}
