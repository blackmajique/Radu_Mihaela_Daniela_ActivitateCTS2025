package ro.cts.seminar06.Clase;

public class Farmacie {
    private final String numeFarmacie;

    public Farmacie(String numeFarmacie) {
        this.numeFarmacie = numeFarmacie;
    }

    public void vindeMedicament(IMedicamentFarmacie medicamentFarmacie) {
        System.out.println("La farmacia " + numeFarmacie);
        medicamentFarmacie.cumparaMedicament();
    }

}
