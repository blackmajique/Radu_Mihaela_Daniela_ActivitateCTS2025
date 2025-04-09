package ro.cts.Radu.Mihaela.Daniela.g1097.FactoryMethod.Clase;

public class NotificareInvitatieEveniment extends ANotificareTemplate{
    public NotificareInvitatieEveniment(String mesajNotificare, String numeDestinatar, String numeReceptor) {
        super(mesajNotificare, numeDestinatar, numeReceptor);
    }

    @Override
    public void afisareDetaliiNotificare() {
        System.out.println("Notificare in privirea invitatiei la un eveniment +" +
                "\n" + "Mesaj: " + getMesajNotificare() + "\nDestinatar: " + getNumeDestinatar() + "\nPrimit de la: "+ getNumeReceptor());
    }
}
