package clase;

public abstract class PrintareRezultate implements IRezultate {
    IRezultate rezultate;

    public PrintareRezultate(IRezultate rezultate) {
        this.rezultate = rezultate;
    }

    public void printareRezultate() {
        rezultate.printareRezultate();
        printareRezultateDecorate();
    }

    public abstract void printareRezultateDecorate();
}
