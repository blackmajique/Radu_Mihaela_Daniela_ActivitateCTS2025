package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocTransport implements Subject {
    private int nrLinie;
    private List<Observer> listaCalatori;

    public MijlocTransport(int nrLinie, List<Observer> listaCalatori) {
        this.nrLinie = nrLinie;
        this.listaCalatori = listaCalatori;
    }

    public MijlocTransport(int nrLinie) {
        this.nrLinie = nrLinie;
        listaCalatori = new ArrayList<Observer>();
    }

    public int getNrLinie() {
        return nrLinie;
    }

    public List<Observer> getListaCalatori() {
        return listaCalatori;
    }

    @Override
    public void adaugaObservabil(Observer observabil) {
        this.listaCalatori.add(observabil);
    }

    @Override
    public void stergeObservabil(Observer observabil) {
        this.listaCalatori.remove(observabil);
    }

    @Override
    public void trimitereMesaj(String mesaj) {
        for(Observer observabil : this.listaCalatori) {
            observabil.primesteMesaj(mesaj);
        }
    }

    public abstract void pleacaDeLaCapat();
}
