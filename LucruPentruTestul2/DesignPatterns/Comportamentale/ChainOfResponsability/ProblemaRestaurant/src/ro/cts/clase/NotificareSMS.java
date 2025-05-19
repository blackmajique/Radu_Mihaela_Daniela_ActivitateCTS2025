package ro.cts.clase;

public class NotificareSMS extends NotificatorBaza{
    @Override
    public void notificaClient(Client client) {
        if(client.getNumarTelefon() != null) {
            System.out.println("Clientul este notificat prin SMS");
        }
        else {
            super.getSuccesor().notificaClient(client);
        }
    }
}
