package SimpleFactory.Clase;

public class RaportDeAerCurat implements AbstractAirQualityReport {
    private final String raport;
    private final int nivelParticuleFine;

    public RaportDeAerCurat(String raport, int nivelParticuleFine) {
        this.raport = raport;
        this.nivelParticuleFine = nivelParticuleFine;
    }

    @Override
    public void afisareRaport() {
        System.out.println("Raportul pentru aer curat: " + raport + " nivel particule fine: " + nivelParticuleFine);
    }
}
