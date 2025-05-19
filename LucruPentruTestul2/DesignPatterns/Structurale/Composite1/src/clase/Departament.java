package clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements IStructura{
    private String nume;
    private int nrAngajati;
    private List<IStructura> lista;

    public Departament(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
        this.lista = new ArrayList<IStructura>();
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Departamentul " + nume + " " + nrAngajati);
    }

    @Override
    public void adaugareStructura(IStructura structura) throws Exception {
        lista.add(structura);
    }

    @Override
    public void stergeStructura(IStructura structura) throws Exception {
        lista.remove(structura);
    }

    @Override
    public IStructura getStructura(int index) throws Exception {
        return lista.get(index);
    }
}
