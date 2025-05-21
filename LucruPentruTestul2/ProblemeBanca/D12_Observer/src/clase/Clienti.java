package clase;

public class Clienti implements Observer {
    @Override
    public void primeseteMesaj(String mesaj) {
        System.out.println("Prime mesaj: " + mesaj);
    }
}
