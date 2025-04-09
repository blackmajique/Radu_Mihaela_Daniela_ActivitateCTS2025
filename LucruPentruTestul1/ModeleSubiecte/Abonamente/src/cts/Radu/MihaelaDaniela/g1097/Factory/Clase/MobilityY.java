package cts.Radu.MihaelaDaniela.g1097.Factory.Clase;

public class MobilityY implements ISubscription{
    private double pretPeLunaAlSubscriptiei;

    public MobilityY(double pretPeLunaAlSubscriptiei) {
        this.pretPeLunaAlSubscriptiei = pretPeLunaAlSubscriptiei;
    }

    @Override
    public Double costTotalAlSubscriptiei(int nrLuniContractuale) {
        return pretPeLunaAlSubscriptiei * nrLuniContractuale;
    }

    @Override
    public void afisareDelatiiSubscriptie() {
        System.out.println("Prescriptia Mobility Y consta in servicii de voce si pentru dumneavoastra costa " + pretPeLunaAlSubscriptiei + " pe luna.");
    }
}
