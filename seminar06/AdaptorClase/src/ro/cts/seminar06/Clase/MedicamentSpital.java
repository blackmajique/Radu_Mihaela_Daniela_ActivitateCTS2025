package ro.cts.seminar06.Clase;

public class MedicamentSpital {
    private String numeMedicament;
    private float pretMedicament;

    public MedicamentSpital(String numeMedicament, float pretMedicament) {
        this.numeMedicament = numeMedicament;
        this.pretMedicament = pretMedicament;
    }

    public void prezintaReteta() {
        System.out.println("Este prezentata reteta pentru medicamentul " + this.numeMedicament);
    }

    public void achizitionareMedicament() {
        prezintaReteta();
        System.out.println("Medicamentul " + this.numeMedicament + " este achizitionat la pretul de " + this.pretMedicament);
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public float getPretMedicament() {
        return pretMedicament;
    }
}
