package clase;

public class MedicamentSpital {
    private final String numeMedicament;
    private final float pretMedicament;

    public MedicamentSpital(String numeMedicament, float pretMedicament) {
        this.numeMedicament = numeMedicament;
        this.pretMedicament = pretMedicament;
    }

    public void prezintaReteta(){
        System.out.println("este prezentata reteta pentru medicamentul " + numeMedicament);
    }

    public void achizitioneaMedicament(){
        prezintaReteta();
        System.out.println("medicamentul " + numeMedicament + " este" +
                " achzitionat la pretul de " + pretMedicament);
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public float getPretMedicament() {
        return pretMedicament;
    }
}
