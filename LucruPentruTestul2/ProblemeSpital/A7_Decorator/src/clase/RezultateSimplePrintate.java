package clase;

public class RezultateSimplePrintate implements IRezultate {
    private String rezultatDiagnostic;
    private String numePacient;

    public RezultateSimplePrintate(String rezultatDiagnostic, String numePacient) {
        this.rezultatDiagnostic = rezultatDiagnostic;
        this.numePacient = numePacient;
    }

    @Override
    public void printareRezultate() {
        System.out.println("Pacientul " + numePacient + " are urmatorul diagnostic: " + rezultatDiagnostic);
    }
}
