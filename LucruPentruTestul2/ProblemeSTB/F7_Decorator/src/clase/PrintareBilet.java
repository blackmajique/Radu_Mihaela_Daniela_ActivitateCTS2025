package clase;

public abstract class PrintareBilet implements IBilet {
    private IBilet bilet;

    public PrintareBilet(IBilet bilet) {
        this.bilet = bilet;
    }

    public void afisareDetaliiBilet() {
        bilet.afisareDetaliiBilet();
        afisareDetaliiBiletSarbatori();
    }

    public abstract void afisareDetaliiBiletSarbatori();
}
