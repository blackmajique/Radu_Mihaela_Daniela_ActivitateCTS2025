package clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiuni implements Structura{
    private String numeMeniuMancare;
    private List<Structura> listaBauturiFancy;
    private List<Structura> listaBauturiBoring;

    public Sectiuni(String numeMeniuMancare) {
        this.numeMeniuMancare = numeMeniuMancare;
        this.listaBauturiFancy = new ArrayList<Structura>();
        this.listaBauturiBoring = new ArrayList<Structura>();
    }

    @Override
    public void adaugaItem(Structura structura1, Structura structura2) {
        listaBauturiFancy.add(structura1);
        listaBauturiBoring.add(structura2);
    }

    @Override
    public void stergeItem(Structura structura1, Structura structura2) {
        listaBauturiFancy.remove(structura1);
        listaBauturiBoring.remove(structura2);
    }

    @Override
    public void printareStructura() {
        System.out.println("Lista comanda: " + numeMeniuMancare +
                "Lista bauturi fancy: ");
        for(Structura s : listaBauturiFancy){
            s.printareStructura();
        }
        System.out.println("Lista bauturi boring: ");
        for(Structura s : listaBauturiBoring){
            s.printareStructura();
        }
    }

    @Override
    public Structura getStructura(int index) {
        return listaBauturiBoring.get(index);
    }
}
