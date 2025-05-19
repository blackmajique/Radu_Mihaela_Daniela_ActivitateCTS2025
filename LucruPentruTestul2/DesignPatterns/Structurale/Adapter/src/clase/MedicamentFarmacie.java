package clase;

public class MedicamentFarmacie {
    private final String numeMedicament;
    private final String dataExpirare;
    private final boolean esteInStoc;
    private final float pretMedicament;

    public MedicamentFarmacie(String numeMedicament, String dataExpirare, boolean esteInStoc, float pretMedicament) {
        this.numeMedicament = numeMedicament;
        this.dataExpirare = dataExpirare;
        this.esteInStoc = esteInStoc;
        this.pretMedicament = pretMedicament;
    }

    public void cumparaMedicament() {
        System.out.println("Medicament: " + numeMedicament + " care expira in data de "
        + dataExpirare + " este este in stoc: " + esteInStoc + ", pret medicament: " + pretMedicament);
    }
}
