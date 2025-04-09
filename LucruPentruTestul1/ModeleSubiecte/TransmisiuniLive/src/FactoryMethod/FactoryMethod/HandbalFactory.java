package FactoryMethod.FactoryMethod;

import FactoryMethod.Clase.Handbal;
import FactoryMethod.Clase.Sport;
import Prototype.ILive;

public class HandbalFactory implements SportFactory {

    @Override
    public Sport createSport(String numeEchipaGazda, String numeEchipaOaspete, ILive live) {
        return new Handbal(numeEchipaGazda, numeEchipaOaspete, live);
    }
}
