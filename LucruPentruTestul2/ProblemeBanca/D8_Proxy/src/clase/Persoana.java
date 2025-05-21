package clase;

public class Persoana implements Cont{
    private String nume;

    public Persoana(String nume) {
        this.nume = nume;
    }

    @Override
    public void creareCont(String moneda) {
        System.out.println("Persoana " + nume + " doreste sa creeze un cont in " + moneda);
    }

}
