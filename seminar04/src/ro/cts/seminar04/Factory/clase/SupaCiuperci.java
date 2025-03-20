package ro.cts.seminar04.Factory.clase;

public class SupaCiuperci extends Supa{
    private double cantitateCiuperci;

    public SupaCiuperci(int gramaj, double pretPerSutaDeGrame, String ingrediente, double cantitateCiuperci) {
        super(gramaj, pretPerSutaDeGrame, ingrediente);
        this.cantitateCiuperci = cantitateCiuperci;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de ciuperci este magnifica! Are " + cantitateCiuperci + " grame de ciuperci!!!");
    }

    @Override
    public double calculPret() {
        return super.calculPret() + cantitateCiuperci * getPretPerSutaDeGrame() / 100;
    }
}
