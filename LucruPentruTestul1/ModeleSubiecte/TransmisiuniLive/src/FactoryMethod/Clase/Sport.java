package FactoryMethod.Clase;

import Prototype.ILive;

public abstract class Sport {
    private String numeEchipaGazda;
    private String numeEchipaOaspete;
    private ILive live;

    public Sport(String numeEchipaGazda, String numeEchipaOaspete, ILive live) {
        this.numeEchipaGazda = numeEchipaGazda;
        this.numeEchipaOaspete = numeEchipaOaspete;
        this.live = live;
    }

    public abstract void afiseazaDetaliiDespreSport();

    public String getNumeEchipaGazda() {
        return numeEchipaGazda;
    }

    public String getNumeEchipaOaspete() {
        return numeEchipaOaspete;
    }

    public ILive getLive() {
        return live;
    }
}
