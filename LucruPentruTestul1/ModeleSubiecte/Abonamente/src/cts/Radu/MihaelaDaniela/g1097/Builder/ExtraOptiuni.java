package cts.Radu.MihaelaDaniela.g1097.Builder;

import cts.Radu.MihaelaDaniela.g1097.Factory.Clase.ISubscription;

public class ExtraOptiuni implements ISubscription {
    ISubscription subscriptionBase;
    private boolean areRoamingInternet;
    private boolean areRoamingMinute;
    private boolean are5G;
    private double pretRoamingInternet;
    private double pretRoamingMinute;
    private double pret5G;

    public ExtraOptiuni() {
        this.pret5G = 10.0;
        this.pretRoamingMinute = 7.0;
        this.pretRoamingInternet = 5.0;
    }

    public ExtraOptiuni(ISubscription subscriptionBase, boolean areRoamingInternet, boolean areRoamingMinute, boolean are5G) {
        this.subscriptionBase = subscriptionBase;
        this.areRoamingInternet = areRoamingInternet;
        this.areRoamingMinute = areRoamingMinute;
        this.are5G = are5G;
    }

    @Override
    public Double costTotalAlSubscriptiei(int nrLuniContractuale) {
        if(areRoamingInternet) {
            return subscriptionBase.costTotalAlSubscriptiei(nrLuniContractuale) + pretRoamingInternet * nrLuniContractuale;
        }
        if(areRoamingMinute) {
            return subscriptionBase.costTotalAlSubscriptiei(nrLuniContractuale) + pretRoamingMinute * nrLuniContractuale;
        }
        if(are5G) {
            return subscriptionBase.costTotalAlSubscriptiei(nrLuniContractuale) + pret5G * nrLuniContractuale;
        }
        return 0.0;
    }

    @Override
    public void afisareDelatiiSubscriptie() {
        subscriptionBase.afisareDelatiiSubscriptie();
        System.out.println("Extraoptiunile alese sunt: "
        + '\n' + "Daca aveti 5G: " + are5G
        + '\n' + "Daca aveti Roaming internet: " + areRoamingInternet +
                '\n' + "Daca aveti Roaming minute: " + areRoamingMinute
                );
    }
}
