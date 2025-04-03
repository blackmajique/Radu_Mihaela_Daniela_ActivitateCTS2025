package ro.cts.seminar06.Clase;

public class AdaptorObiecteMedicamente extends MedicamentFarmacie {

    MedicamentSpital medicamentSpital;

    public AdaptorObiecteMedicamente(MedicamentSpital medicamentSpital) {
        super(medicamentSpital.getNumeMedicament(), "25.09.2022", true, medicamentSpital.getPretMedicament());
        this.medicamentSpital = medicamentSpital;
    }

    // folosim ce e implementat deja
    @Override
    public void cuparaMedicament() {
        medicamentSpital.achizitionareMedicament();
    }
}
