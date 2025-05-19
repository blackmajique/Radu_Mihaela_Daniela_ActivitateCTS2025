package clase;

public class AdaptorObiecteMedicamente extends MedicamentFarmacie{
    MedicamentSpital medicamentSpital;

    public AdaptorObiecteMedicamente(MedicamentSpital medicamentSpital) {
        super(medicamentSpital.getNumeMedicament(), "25.02.2029", true, medicamentSpital.getPretMedicament());
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneaMedicament();
    }
}
