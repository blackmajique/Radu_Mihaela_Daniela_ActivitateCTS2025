package FactoryMethod.FactoryMethod;

import FactoryMethod.Clase.Fotbal;
import FactoryMethod.Clase.Sport;
import Prototype.ILive;

public class FotbalFactory implements SportFactory {
    @Override
    public Sport createSport(String numeEchipaGazda, String numeEchipaOaspete, ILive live) {
        return new Fotbal(numeEchipaGazda, numeEchipaOaspete, live);
    }
}
