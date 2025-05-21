package clase;

public class Client implements Observer{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println("Clientul " + nume + " primeste urmatorul mesaj " + mesaj);
    }
}
