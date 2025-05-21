package clase;

public class DetaliiCont implements IDetaliiCont{
    private int nrCont;
    private float sumaCont;

    public DetaliiCont(int nrCont, float sumaCont) {
        this.nrCont = nrCont;
        this.sumaCont = sumaCont;
    }

    @Override
    public String toString() {
        return "DetaliiCont{" +
                "nrCont=" + nrCont +
                ", sumaCont=" + sumaCont +
                '}';
    }

    @Override
    public void afisareDetalii(DetinatorCont detinator, DetaliiBanca detaliiBanca) {
        System.out.println(this.toString());
        System.out.println(detinator.toString());
        System.out.println(detaliiBanca.toString());
    }
}
