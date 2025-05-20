package clase;

public class BiletSimplu implements IBilet{
    private float pret;
    private String numeDetinator;

    public BiletSimplu(float pret, String numeDetinator) {
        this.pret = pret;
        this.numeDetinator = numeDetinator;
    }

    @Override
    public void afisareDetaliiBilet() {
        System.out.println("Afisarea detaliilor biletului: " + pret + " lei si e detinut de " + numeDetinator);
    }
}
