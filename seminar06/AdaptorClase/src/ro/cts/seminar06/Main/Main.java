package ro.cts.seminar06.Main;

import ro.cts.seminar06.Clase.AdaptorClaseMedicamente;
import ro.cts.seminar06.Clase.Farmacie;
import ro.cts.seminar06.Clase.MedicamentFarmacie;

public class Main {
    public static void main(String[] args) {
        Farmacie farmacie = new Farmacie("Catena");

        MedicamentFarmacie medicamentFarmacie1 = new MedicamentFarmacie("ParaSinus", "13.04.2026", true, 29.99f);
        MedicamentFarmacie medicamentFarmacie2 = new MedicamentFarmacie("Coldrex", "13.04.2026", true, 29.99f);

        farmacie.vindeMedicament(medicamentFarmacie1);
        farmacie.vindeMedicament(medicamentFarmacie2);

        AdaptorClaseMedicamente adaptorClaseMedicamente = new AdaptorClaseMedicamente("Ceai", 23.22f);
        farmacie.vindeMedicament(adaptorClaseMedicamente);
    }
}
