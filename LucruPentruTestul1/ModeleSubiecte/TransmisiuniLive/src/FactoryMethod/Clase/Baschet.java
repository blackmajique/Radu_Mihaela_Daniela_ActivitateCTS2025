package FactoryMethod.Clase;

import Prototype.ILive;

public class Baschet extends Sport{
    public Baschet(String numeEchipaGazda, String numeEchipaOaspete, ILive live) {
        super(numeEchipaGazda, numeEchipaOaspete, live);
    }

    @Override
    public void afiseazaDetaliiDespreSport() {
        System.out.println("Baschet cu echipa gazda " + getNumeEchipaGazda() + " si echipa oaspete " + getNumeEchipaOaspete() + " live pe " + getLive().toString());
    }
}
