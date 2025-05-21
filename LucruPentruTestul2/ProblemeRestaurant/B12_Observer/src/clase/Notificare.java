package clase;

import java.util.ArrayList;
import java.util.List;

public class Notificare implements Subject{
    private List<Observer> listaClienti;

    public Notificare() {
        this.listaClienti = new ArrayList<Observer>();
    }

    @Override
    public void adaugaObservabile(Observer observer) {
        listaClienti.add(observer);
    }

    @Override
    public void stergeObservabile(Observer observer) {
        listaClienti.remove(observer);
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(Observer o : listaClienti) {
            o.primesteMesaj(mesaj);
        }
    }
}
