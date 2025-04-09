package cts.Radu.MihaelaDaniela.g1097.Builder;

import cts.Radu.MihaelaDaniela.g1097.Factory.Clase.ISubscription;

public class ExtraOptiuniBuilder implements IBuilder{
    ISubscription subscriptionBase;
    private boolean areRoamingInternet;
    private boolean areRoamingMinute;
    private boolean are5G;
    private double pretRoamingInternet;
    private double pretRoamingMinute;
    private double pret5G;

    public ExtraOptiuniBuilder(ISubscription subscriptionBase) {
        this.subscriptionBase = subscriptionBase;
        this.pret5G = 10.0;
        this.pretRoamingMinute = 7.0;
        this.pretRoamingInternet = 5.0;
    }



    public ExtraOptiuniBuilder areRoamingInternet(boolean areRoamingInternet) {
        this.areRoamingInternet = areRoamingInternet;
        return this;
    }

    public ExtraOptiuniBuilder areRoamingMinute(boolean areRoamingMinute) {
        this.areRoamingMinute = areRoamingMinute;
        return this;
    }

    public ExtraOptiuniBuilder are5G(boolean are5G) {
        this.are5G = are5G;
        return this;
    }

    @Override
    public ExtraOptiuni build() {
        ExtraOptiuni extraOptiuni = new ExtraOptiuni(subscriptionBase, areRoamingInternet, areRoamingMinute, are5G);
        return extraOptiuni;
    }
}
