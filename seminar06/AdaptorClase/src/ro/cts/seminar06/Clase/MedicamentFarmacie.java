package ro.cts.seminar06.Clase;

public class MedicamentFarmacie implements IMedicamentFarmacie{
    private String numeMedicament;
    private String dataExpirare;
    private boolean esteInStoc;
    private float pretMedicament;

    public MedicamentFarmacie(String numeMedicament, String dataExpirare, boolean esteInStoc, float pretMedicament) {
        this.numeMedicament = numeMedicament;
        this.dataExpirare = dataExpirare;
        this.esteInStoc = esteInStoc;
        this.pretMedicament = pretMedicament;
    }

    public MedicamentFarmacie(String numeMedicament, float pret) {
    }

    @Override
    public void cumparaMedicament() {
        System.out.println("Medicamentul " + this.numeMedicament + " care expira in data de " + this.dataExpirare + " a fost cumparat" +
                " la pretul de " + this.pretMedicament);
    }
}
