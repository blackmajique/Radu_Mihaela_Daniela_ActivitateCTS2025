package clase;

public class Internare implements IInternare{
    private String dataInternare;
    private int nrSpitalizare;

    public Internare(String dataInternare, int nrSpitalizare) {
        this.dataInternare = dataInternare;
        this.nrSpitalizare = nrSpitalizare;
    }

    @Override
    public void internare() {
        System.out.println("Pacientul este internat la data de " + dataInternare +
                "si va sta in spital " + nrSpitalizare + " zile");
    }
}
