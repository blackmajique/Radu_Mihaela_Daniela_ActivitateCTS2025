package clase;

public class MasaRezervata {
    private int nrMasa;
    private int nrPersoane;
    private String oraRezervare;

    public MasaRezervata(int nrMasa, int nrPersoane, String oraRezervare) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.oraRezervare = oraRezervare;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "nrMasa=" + nrMasa +
                ", nrPersoane=" + nrPersoane +
                ", oraRezervare='" + oraRezervare + '\'' +
                '}';
    }
}
