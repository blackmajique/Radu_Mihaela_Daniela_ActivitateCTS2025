package ro.cts.Radu.Mihaela.Daniela.g1097.FactoryMethod.Factory;

import ro.cts.Radu.Mihaela.Daniela.g1097.FactoryMethod.Clase.ANotificareTemplate;
import ro.cts.Radu.Mihaela.Daniela.g1097.FactoryMethod.Clase.NotificareAnulareEveniment;

public class AnulareEvenimentFactory implements IFactory {
    @Override
    public ANotificareTemplate creareNotificare(String mesajNotificare, String numeDestinatar, String numeReceptor) {
        return new NotificareAnulareEveniment(mesajNotificare, numeDestinatar, numeReceptor);
    }
}
