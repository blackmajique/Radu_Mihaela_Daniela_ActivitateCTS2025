package Decorator.Clase;

public class NodaDePlataRevelion extends PrintareFelicitare{

    public NodaDePlataRevelion(NotaP nodaDePlata) {
        super(nodaDePlata);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("La multi ani, 2025!");
    }
}
