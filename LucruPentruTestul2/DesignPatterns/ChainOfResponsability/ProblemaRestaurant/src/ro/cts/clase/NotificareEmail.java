package ro.cts.clase;

public class NotificareEmail extends NotificatorBaza{
    @Override
    public void notificaClient(Client client) {
        if(client.getEmail() != null) {
            System.out.println("Clientul este notificat prin email");
        }
        else {
            super.getSuccesor().notificaClient(client);
        }
    }
}
