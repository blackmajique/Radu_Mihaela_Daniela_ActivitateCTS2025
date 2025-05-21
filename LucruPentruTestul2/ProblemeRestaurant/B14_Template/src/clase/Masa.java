package clase;

public class Masa extends Template{
    private int nrMasa;
    private int nrPersoane;

    public Masa(int nrMasa, int nrPersoane) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    @Override
    public void curataMasa() {
        System.out.println("Masa a fost curatata");
    }

    @Override
    public void aseazaServetele() {
        System.out.println("Masa a fost asezata");
    }

    @Override
    public void aseazaTacamuri() {
        System.out.println("TAcamurile au fost puse");
    }

    @Override
    public boolean invitaPersoane(int nrPersoane) {
        if(nrPersoane == this.nrPersoane) {
            return true;
        }
        return false;
    }
}
