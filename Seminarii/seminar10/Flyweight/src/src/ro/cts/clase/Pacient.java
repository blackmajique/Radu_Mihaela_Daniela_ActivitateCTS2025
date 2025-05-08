package src.ro.cts.clase;

public class Pacient implements PacientAbstract {
    private String numePacient;
    private String nrTelefon;
    private String adresaEmail;

    public Pacient(String numePacient, String nrTelefon, String adresaEmail) {
        this.numePacient = numePacient;
        this.nrTelefon = nrTelefon;
        this.adresaEmail = adresaEmail;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "numePacient='" + numePacient + '\'' +
                ", nrTelefon='" + nrTelefon + '\'' +
                ", adresaEmail='" + adresaEmail + '\'' +
                '}';
    }

    @Override
    public void afiseazaPacient(Spitalizare spitalizare) {
        System.out.println(this.toString());
        System.out.println(spitalizare.toString());
    }
}
