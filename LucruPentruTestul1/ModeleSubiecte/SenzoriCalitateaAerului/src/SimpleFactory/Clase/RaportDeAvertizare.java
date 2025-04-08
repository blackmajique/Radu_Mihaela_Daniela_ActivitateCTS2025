package SimpleFactory.Clase;

public class RaportDeAvertizare implements AbstractAirQualityReport {
    private final String raport;
    private final int nivelParticuleFine;

    public RaportDeAvertizare(String raport, int nivelParticuleFine) {
        this.raport = raport;
        this.nivelParticuleFine = nivelParticuleFine;
    }

    @Override
    public void afisareRaport() {
        System.out.println("Raport: " + raport + " nivelParticuleFine: " + nivelParticuleFine);
    }
}
