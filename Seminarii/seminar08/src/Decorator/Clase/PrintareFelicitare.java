package Decorator.Clase;

public abstract class PrintareFelicitare implements NotaP {
    private NotaP nodaDePlata;

    public PrintareFelicitare(NotaP nodaDePlata) {
        this.nodaDePlata = nodaDePlata;
    }

    @Override
    public void printare() {
        nodaDePlata.printare();
        printareFelicitare();
    }

    protected abstract void printareFelicitare();
}
