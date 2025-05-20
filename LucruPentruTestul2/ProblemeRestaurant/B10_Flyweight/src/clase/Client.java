package clase;

public class Client implements IClient{
    private String nume;
    private String nrTelefon;
    private String adresaMail;

    public Client(String nume, String nrTelefon, String adresaMail) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresaMail = adresaMail;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", nrTelefon='" + nrTelefon + '\'' +
                ", adresaMail='" + adresaMail + '\'' +
                '}';
    }

    @Override
    public void descriereClient(MasaRezervata rezervare) {
        System.out.println(this.toString());
        System.out.println(rezervare.toString());
    }
}
