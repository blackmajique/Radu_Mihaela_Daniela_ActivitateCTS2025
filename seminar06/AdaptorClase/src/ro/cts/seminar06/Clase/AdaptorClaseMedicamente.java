package ro.cts.seminar06.Clase;

public class AdaptorClaseMedicamente extends MedicamentSpital implements IMedicamentFarmacie {

    public AdaptorClaseMedicamente(String numeMedicament, float pret) {
        super(numeMedicament, pret);
    }

    @Override
    public void cumparaMedicament() {
        super.achizitionareMedicament();
    }
}
