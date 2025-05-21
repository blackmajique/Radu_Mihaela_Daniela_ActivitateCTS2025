package clase;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements Structura{
    private String numeAgentie;
    private List<Structura> listaSucursale;

    public Agentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
        this.listaSucursale = new ArrayList<Structura>();
    }

    @Override
    public void adaugaNod(Structura structura) throws Exception {
        listaSucursale.add(structura);
    }

    @Override
    public void stergeNod(Structura structura) throws Exception {
        listaSucursale.remove(structura);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Nume agentie: " + numeAgentie);
        for (Structura struct : listaSucursale) {
            struct.afiseazaDetalii();
        }
    }

    @Override
    public Structura getNod(int index) throws Exception {
        return listaSucursale.get(index);
    }
}
