package clase;

public class NotaDeCraciun extends PrinteazaFelicitare{

    public NotaDeCraciun(NodaPlata nodaDePlata) {
        super(nodaDePlata);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("Craciun fericit! - 2025");
    }
}
