package ro.cts.Radu.Mihaela.Daniela.g1097.Protoype;

public class Notificare implements INotificare {
    private String mesajNotificare;
    private String numeDestinatar;

    public Notificare() {
        this.mesajNotificare = "Necunoscut";
        this.numeDestinatar = "Necunoscut";
    }

    public Notificare(String mesajNotificare, String numeDestinatar) {
        this.mesajNotificare = mesajNotificare;
        this.numeDestinatar = numeDestinatar;
    }

    @Override
    public Notificare clone() {
        Notificare notificare = new Notificare(this.mesajNotificare, this.numeDestinatar);
        return notificare;
    }

    @Override
    public Notificare clone(String numeDestinatar) {
        Notificare notificare = new Notificare(this.mesajNotificare, numeDestinatar);
        return notificare;
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Mesaj notificare: " + mesajNotificare);
        System.out.println("Notificare pentru: " + numeDestinatar);
    }

    public void setMesajNotificare(String mesajNotificare) {
        this.mesajNotificare = mesajNotificare;
    }

    public void setNumeDestinatar(String numeDestinatar) {
        this.numeDestinatar = numeDestinatar;
    }
}
