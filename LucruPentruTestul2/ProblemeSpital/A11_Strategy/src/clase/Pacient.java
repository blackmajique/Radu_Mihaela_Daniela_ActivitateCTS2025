package clase;

public class Pacient {
    private String nume;
    private ModPlata modPlata;

    public Pacient(String nume) {
        this.nume = nume;
        this.modPlata = modPlata;
    }

    public Pacient(String nume, ModPlata modPlata) {
        this.nume = nume;
        this.modPlata = modPlata;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void realizeazaPlata() {
        modPlata.plateste();
    }
}
