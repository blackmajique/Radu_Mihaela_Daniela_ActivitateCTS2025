public class Rezervare extends ARezervare{


    public Rezervare(String numeClient, int nrRezervare, String data, String ora) {
        super(numeClient, nrRezervare, data, ora);
    }

    public Rezervare() {
    }

    @Override
    public void descriere() {
        System.out.println("Aceasta este o rezervare.");
    }

    @Override
    public ARezervare copiaza() {
        Rezervare rezervare = new Rezervare();

        rezervare.nrPersoane = this.nrPersoane;
        rezervare.data = this.data;
        rezervare.ora = this.ora;
        rezervare.numeClient = this.numeClient;
        return rezervare;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "numeClient='" + numeClient + '\'' +
                ", nrPersoane=" + nrPersoane +
                ", ora='" + ora + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
