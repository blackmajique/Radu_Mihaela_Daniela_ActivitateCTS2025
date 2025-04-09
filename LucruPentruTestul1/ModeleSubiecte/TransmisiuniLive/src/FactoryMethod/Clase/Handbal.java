package FactoryMethod.Clase;

import Prototype.ILive;

public class Handbal extends Sport{

    public Handbal(String numeEchipaGazda, String numeEchipaOaspete, ILive live) {
        super(numeEchipaGazda, numeEchipaOaspete, live);
    }

    @Override
    public void afiseazaDetaliiDespreSport() {
        System.out.println("Handbal cu echipa gazda " + getNumeEchipaGazda() + " si echipa oaspete " + getNumeEchipaOaspete() + " live pe " + getLive().toString());
    }
}
