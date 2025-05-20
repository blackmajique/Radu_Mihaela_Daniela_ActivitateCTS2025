package clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura {
    private String numeDepartament;
    private int numarPacienti;
    private List<Structura> listaSubdepartamente;

    public Departament(String numeDepartament, int numarPacienti) {
        this.numeDepartament = numeDepartament;
        this.numarPacienti = numarPacienti;
        this.listaSubdepartamente = new ArrayList<Structura>();
    }

    @Override
    public void adaugaStructura(Structura s) throws Exception {
        listaSubdepartamente.add(s);
    }

    @Override
    public void stergeStructura(Structura s) throws Exception {
        listaSubdepartamente.remove(s);
    }

    @Override
    public void printareStructura() {
        System.out.println("Departament{" +
                "numeDepartament='" + numeDepartament + '\'' +
                ", numarPacienti=" + numarPacienti);
        for(Structura subdepartament : listaSubdepartamente) {
            System.out.println("subdepartament=" );
            subdepartament.printareStructura();
        }
    }

    @Override
    public Structura getStructura(int index) throws Exception {
        return listaSubdepartamente.get(index);
    }

}
