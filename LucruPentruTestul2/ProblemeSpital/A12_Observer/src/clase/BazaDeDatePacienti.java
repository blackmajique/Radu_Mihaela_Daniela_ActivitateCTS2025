package clase;

import java.util.ArrayList;
import java.util.List;

public class BazaDeDatePacienti implements Subject{
    private List<Observer> listaPacienti;

    public BazaDeDatePacienti() {
        this.listaPacienti = new ArrayList<Observer>();
    }

    @Override
    public void adaugaObservabil(Observer observer) {
        listaPacienti.add(observer);
    }

    @Override
    public void stergeObservabil(Observer observer) {
        listaPacienti.remove(observer);
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        String introducere = "A aparut o urgenta in oras: ";
        for (Observer o : listaPacienti) {
            o.primesteMesaj(introducere + mesaj);
        }
    }
}
