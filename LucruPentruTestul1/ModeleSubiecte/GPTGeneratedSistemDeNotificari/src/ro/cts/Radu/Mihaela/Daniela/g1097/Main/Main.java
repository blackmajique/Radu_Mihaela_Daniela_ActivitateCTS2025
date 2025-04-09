package ro.cts.Radu.Mihaela.Daniela.g1097.Main;// 3p. Ați dezvoltat o aplicație mobilă care trimite notificări personalizate utilizatorilor în funcție de acțiunile lor din aplicație.
// Realizați faptul că, pe măsură ce trimiteți notificări prin mai multe canale (ex: email, SMS, notificare push),
// timpul de inițializare al fiecărei notificări crește semnificativ, deși structura generală a mesajului rămâne aceeași.
// Ținând cont că anumite notificări (ex: „Eveniment creat”, „Invitație primită”) sunt reutilizate frecvent,
// implementați o soluție care să optimizeze timpul de creare al acestor notificări,
// permițând totodată personalizarea unor detalii precum numele destinatarului.
//
// 1.5p. Testați implementarea prin generarea a 3 notificări de același tip trimise prin canale diferite,
// demonstrând că acestea pot avea conținut personalizat fără a fi generate complet de la zero.
//
// 3p. Aplicația suportă 3 tipuri principale de notificări: confirmare eveniment, invitație la eveniment și anulare eveniment.
// Acestea conțin informații diferite și au un comportament specific. Se dorește o soluție flexibilă care să permită crearea
// dinamică a notificării potrivite, în funcție de tipul notificării, fără a modifica implementarea deja existentă.
//
// 1.5p. Testați în metoda `main()` crearea a cel puțin 3 notificări diferite, evitând referințele directe la clasele concrete.

import ro.cts.Radu.Mihaela.Daniela.g1097.FactoryMethod.Clase.ANotificareTemplate;
import ro.cts.Radu.Mihaela.Daniela.g1097.FactoryMethod.Factory.AnulareEvenimentFactory;
import ro.cts.Radu.Mihaela.Daniela.g1097.FactoryMethod.Factory.ConfirmareEvenimentFactory;
import ro.cts.Radu.Mihaela.Daniela.g1097.FactoryMethod.Factory.IFactory;
import ro.cts.Radu.Mihaela.Daniela.g1097.FactoryMethod.Factory.InvitatieEvenimentFactory;
import ro.cts.Radu.Mihaela.Daniela.g1097.Protoype.INotificare;
import ro.cts.Radu.Mihaela.Daniela.g1097.Protoype.Notificare;

public class Main {
    public static void main(String[] args) {
        INotificare notificare = new Notificare("Ti-a intrat un mesaj de la Cristi", "Daniela");
        notificare.afisareDetalii();

        INotificare notificare2 = notificare.clone();
        notificare2.afisareDetalii();

        INotificare notificare3 = notificare.clone();
        notificare3.afisareDetalii();

        INotificare notificare4 = notificare.clone("Marius");
        notificare4.afisareDetalii();

        INotificare notificare5 = notificare.clone("Andrei");
        notificare5.afisareDetalii();

        IFactory factory = new AnulareEvenimentFactory();
        ANotificareTemplate notificare1 = factory.creareNotificare("Concertul lui Stefan Banica a fost anulat", "Radai Dragos", "Eu");
        notificare1.afisareDetaliiNotificare();

        IFactory factory2 = new ConfirmareEvenimentFactory();
        ANotificareTemplate notificare10 = factory2.creareNotificare("Va rugam confirmati prezenta la workshop-ul de maine", "Daniela", "Adobe company");
        notificare10.afisareDetaliiNotificare();

        IFactory factory3 = new InvitatieEvenimentFactory();
        ANotificareTemplate notificare11 = factory3.creareNotificare("Va invitam la evenimentul cu cei mai mari mici din lume", "Dumneavoastra", "eu");
        notificare11.afisareDetaliiNotificare();
        ANotificareTemplate notificare12 = factory3.creareNotificare("Pk", "ok", "Ok");
        notificare12.afisareDetaliiNotificare();
    }
}