package ro.cts.Radu.Mihaela.Daniela.g1097.FactoryMethod.Factory;

import ro.cts.Radu.Mihaela.Daniela.g1097.FactoryMethod.Clase.ANotificareTemplate;
import ro.cts.Radu.Mihaela.Daniela.g1097.FactoryMethod.Clase.NotificareInvitatieEveniment;

public class InvitatieEvenimentFactory implements IFactory {
    @Override
    public ANotificareTemplate creareNotificare(String mesajNotificare, String numeDestinatar, String numeReceptor) {
        return new NotificareInvitatieEveniment(mesajNotificare, numeDestinatar, numeReceptor);
    }
}
