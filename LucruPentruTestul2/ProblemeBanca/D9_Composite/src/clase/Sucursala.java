package clase;

import java.util.ArrayList;
import java.util.List;

public class Sucursala implements Structura{
    private String nume;
    private List<Structura> listaFiliale;

    public Sucursala(String nume) {
        this.nume = nume;
        this.listaFiliale = new ArrayList<Structura>();
    }

    @Override
    public void adaugaNod(Structura structura) throws Exception {
        listaFiliale.add(structura);
    }

    @Override
    public void stergeNod(Structura structura) throws Exception {
        listaFiliale.remove(structura);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Nume sucursala: " + nume);
        for (Structura structura : listaFiliale) {
            structura.afiseazaDetalii();
        }
    }

    @Override
    public Structura getNod(int index) throws Exception {
        return listaFiliale.get(index);
    }
}
