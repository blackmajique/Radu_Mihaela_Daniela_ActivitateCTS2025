package clase;

public class BiletSarbatori extends PrintareBilet{
    private String mesajDeSarbatori;

    public BiletSarbatori(IBilet bilet) {
        super(bilet);
    }

    @Override
    public void afisareDetaliiBiletSarbatori() {
        System.out.println("La multi ani!");
    }
}
