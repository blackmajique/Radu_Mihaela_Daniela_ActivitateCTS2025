package ro.cts.clase;

public class NotificareManager extends NotificatorBaza{
    @Override
    public void notificaClient(Client client) {
        if(client.getNumarTelefon() == null && client.getEmail() == null) {
            System.out.println("Domnule manager, acest client nu are datele personale");
        }
    }
}
