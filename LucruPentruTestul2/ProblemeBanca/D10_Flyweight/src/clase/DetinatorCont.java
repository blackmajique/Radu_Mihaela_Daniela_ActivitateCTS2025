package clase;

public class DetinatorCont {
    private String nume;
    private String nrTelefon;
    private String email;

    public DetinatorCont(String nume, String nrTelefon, String email) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.email = email;
    }

    @Override
    public String toString() {
        return "DetinatorCont{" +
                "nume='" + nume + '\'' +
                ", nrTelefon='" + nrTelefon + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
