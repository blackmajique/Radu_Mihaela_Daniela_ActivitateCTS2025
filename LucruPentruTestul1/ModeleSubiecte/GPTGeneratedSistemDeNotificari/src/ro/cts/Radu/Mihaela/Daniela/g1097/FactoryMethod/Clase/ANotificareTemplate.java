package ro.cts.Radu.Mihaela.Daniela.g1097.FactoryMethod.Clase;

public abstract class ANotificareTemplate {
    private String mesajNotificare;
    private String numeDestinatar;
    private String numeReceptor;

    public ANotificareTemplate(String mesajNotificare, String numeDestinatar, String numeReceptor) {
        this.mesajNotificare = mesajNotificare;
        this.numeDestinatar = numeDestinatar;
        this.numeReceptor = numeReceptor;
    }

    public abstract void afisareDetaliiNotificare();

    public String getMesajNotificare() {
        return mesajNotificare;
    }

    public String getNumeDestinatar() {
        return numeDestinatar;
    }

    public String getNumeReceptor() {
        return numeReceptor;
    }
}
