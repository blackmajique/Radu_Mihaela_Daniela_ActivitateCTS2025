package cts.Radu.MihaelaDaniela.g1097.Factory.Clase;

public class MobilityX implements ISubscription {
    private double pretPeLunaAlSubscriptiei;

    public MobilityX(double pretPeLunaAlSubscriptiei) {
        this.pretPeLunaAlSubscriptiei = pretPeLunaAlSubscriptiei;
    }

    @Override
    public Double costTotalAlSubscriptiei(int nrLuniContractuale) {
        return pretPeLunaAlSubscriptiei * nrLuniContractuale;
    }

    @Override
    public void afisareDelatiiSubscriptie() {
        System.out.println("Prescriptia Mobility X consta in servicii de voce si pentru dumneavoastra costa " + pretPeLunaAlSubscriptiei + " pe luna.");
    }
}
