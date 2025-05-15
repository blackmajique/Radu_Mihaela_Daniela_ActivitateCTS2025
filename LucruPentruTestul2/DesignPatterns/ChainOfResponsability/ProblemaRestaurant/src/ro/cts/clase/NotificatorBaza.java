package ro.cts.clase;

public abstract class NotificatorBaza{
    private NotificatorBaza succesor;

    public NotificatorBaza getSuccesor() {
        return succesor;
    }

    public void setSuccesor(NotificatorBaza succesor) {
        this.succesor = succesor;
    }

    public abstract void notificaClient(Client client);
}
