package FactoryMethod.FactoryMethod;

import FactoryMethod.Clase.Sport;
import Prototype.ILive;

public interface SportFactory {
    Sport createSport(String numeEchipaGazda, String numeEchipaOaspete, ILive live);
}
