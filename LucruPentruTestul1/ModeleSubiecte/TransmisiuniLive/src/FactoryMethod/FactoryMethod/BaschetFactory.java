package FactoryMethod.FactoryMethod;

import FactoryMethod.Clase.Baschet;
import FactoryMethod.Clase.Sport;
import Prototype.ILive;

public class BaschetFactory implements SportFactory {
    @Override
    public Sport createSport(String numeEchipaGazda, String numeEchipaOaspete, ILive live) {
        return new Baschet(numeEchipaGazda, numeEchipaOaspete, live);
    }
}
