package cts.Radu.MihaelaDaniela.g1097.Factory.SimpleFactory;

import cts.Radu.MihaelaDaniela.g1097.Factory.Clase.*;

public class SubscriptionSimpleFactory {
    public ISubscription createSubscription(TipMobility tipMobility) {
        switch (tipMobility){
            case X -> {
                return new MobilityX(30.0);
            }
            case Y -> {
                return new MobilityY(45.0);
            }
            case Z -> {
                return new MobilityZ(60.);
            }
            default -> {
                return null;
            }
        }
    }
}
