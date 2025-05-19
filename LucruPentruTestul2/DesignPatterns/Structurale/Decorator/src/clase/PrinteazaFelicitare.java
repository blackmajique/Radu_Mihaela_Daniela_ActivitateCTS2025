package clase;

public abstract class PrinteazaFelicitare implements NodaPlata{
    private NodaPlata nodaDePlata;

    public PrinteazaFelicitare(NodaPlata nodaDePlata) {
        this.nodaDePlata = nodaDePlata;
    }

    @Override
    public void printareMesaj() {
        nodaDePlata.printareMesaj();
        printareFelicitare();
    }

    protected abstract void printareFelicitare();
}
