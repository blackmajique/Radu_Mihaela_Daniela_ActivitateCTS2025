package clase;

public class Pacient implements Observer {
    private String nume;

    public Pacient(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println("pacientul cu numele " + nume + ": " + mesaj);
    }
}
