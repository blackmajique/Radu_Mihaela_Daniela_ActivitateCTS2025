package main;

import clase.AdaptorObiecteMedicamente;
import clase.MedicamentFarmacie;
import clase.MedicamentSpital;

public class Main {
    public static void vindeMedicament(MedicamentFarmacie medicament){
        System.out.println("Bine ati venit la farmacia Dr. Max");
        medicament.cumparaMedicament();
    }

    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Ibuprofen", "12.12.2027", true, 24.45f);
        MedicamentSpital medicamentSpital = new MedicamentSpital("Paracetamol", 12.11f);

        vindeMedicament(medicamentFarmacie);

        AdaptorObiecteMedicamente adaptorObiecteMedicamente = new AdaptorObiecteMedicamente(medicamentSpital);
        vindeMedicament(adaptorObiecteMedicamente);
    }
}