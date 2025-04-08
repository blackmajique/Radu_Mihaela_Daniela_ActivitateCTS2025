package SimpleFactory.Clase;

public class RaportDeRiscSanatate implements AbstractAirQualityReport {
    private final String raport;
    private final int nivelParticuleFine;

    public RaportDeRiscSanatate(String raport, int nivelParticuleFine) {
        this.raport = raport;
        this.nivelParticuleFine = nivelParticuleFine;
    }

    @Override
    public void afisareRaport() {
        System.out.println("Raport: " + raport + " nivelParticuleFine: " + nivelParticuleFine);
    }
}
