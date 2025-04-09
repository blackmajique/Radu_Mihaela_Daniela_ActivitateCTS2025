package ro.cts.Radu.Mihaela.Daniela.g1097.FactoryMethod.Factory;

import ro.cts.Radu.Mihaela.Daniela.g1097.FactoryMethod.Clase.ANotificareTemplate;

public interface IFactory {
    ANotificareTemplate creareNotificare(String mesajNotificare, String numeDestinatar, String numeReceptor);
}
