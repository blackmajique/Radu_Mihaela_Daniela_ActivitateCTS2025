package Prototype;

import java.util.ArrayList;
import java.util.List;

public class TransmisiuneLive implements ILive {
    private String platforma;
    private int nrVizionari;
    private List<String> Comentarii;

    public TransmisiuneLive(String platforma, int nrVizionari, List<String> comentarii) {
        this.platforma = platforma;
        this.nrVizionari = nrVizionari;
        Comentarii = comentarii;
    }

    public void adaugaComentarii(String comentarii) {
        Comentarii.add(comentarii);
    }

    @Override
    public void startTransmisiuneLive() {
        System.out.println("Suntem live pe " + this.platforma);
        System.out.println("Avem " + this.nrVizionari + " spectatori" );
        System.out.println("Comentarii = " + Comentarii);
    }

    @Override
    public ILive clone() {
       TransmisiuneLive copie = new TransmisiuneLive(this.platforma, this.nrVizionari, Comentarii);
       copie.Comentarii = new ArrayList<>(this.Comentarii);
       return copie;
    }
}
