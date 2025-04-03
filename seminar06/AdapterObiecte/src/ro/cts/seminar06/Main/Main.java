package ro.cts.seminar06.Main;

import ro.cts.seminar06.Clase.AdaptorObiecteMedicamente;
import ro.cts.seminar06.Clase.MedicamentFarmacie;
import ro.cts.seminar06.Clase.MedicamentSpital;

public class Main {

    public static void vindeMedicament(MedicamentFarmacie medicamentFarmacie) {
        System.out.println("Bine ati venit la farmacia Dr. Max");
        medicamentFarmacie.cuparaMedicament();
    }

    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Ibuprofen", "12.12.2027", true, 24.45f);
        MedicamentSpital medicamentSpital = new MedicamentSpital("Paracetamol", 12.11f);

        vindeMedicament(medicamentFarmacie);

        AdaptorObiecteMedicamente adaptorObiecteMedicamente = new AdaptorObiecteMedicamente(medicamentSpital);
        vindeMedicament(adaptorObiecteMedicamente);
    }

    // interfata este la ce adaptam pentru adaptorul de clase!!!
}
