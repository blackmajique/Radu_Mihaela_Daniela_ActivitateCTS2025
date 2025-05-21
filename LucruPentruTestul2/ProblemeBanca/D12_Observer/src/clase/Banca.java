package clase;

import java.util.ArrayList;
import java.util.List;

public class Banca implements Subject{
    private List<Observer> listaClienti;

    public Banca() {
        this.listaClienti = new ArrayList<Observer>();
    }

    @Override
    public void adaugaObserver(Observer observer) {
        listaClienti.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        listaClienti.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(Observer observer : listaClienti) {
            observer.primeseteMesaj(mesaj);
        }
    }
}
