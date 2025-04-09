package FactoryMethod.Clase;

import Prototype.ILive;

public class Fotbal extends Sport{
    public Fotbal(String numeEchipaGazda, String numeEchipaOaspete, ILive live) {
        super(numeEchipaGazda, numeEchipaOaspete, live);
    }

    @Override
    public void afiseazaDetaliiDespreSport() {
        System.out.println("Fotbal cu echipa gazda " + getNumeEchipaGazda() + " si echipa oaspete " + getNumeEchipaOaspete() + " live pe " + getLive().toString());
    }
}
