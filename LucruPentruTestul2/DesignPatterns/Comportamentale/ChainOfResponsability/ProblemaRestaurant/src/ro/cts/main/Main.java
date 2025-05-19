package ro.cts.main;

//B.16. Restaurantul dorește să anunțe clienții fideli ori de câte ori apar noi oferte.
//Astfel se dorește implementarea unui modul sa notifice clienții restaurantului.
//Problema este că restaurantul deține pentru anumiți clienți numărul de telefon,
//iar pentru alți clienți doar adresa de mail. Să se implementeze funcționalitatea
//de a trimite notificări clienților prin SMS, iar în cazul în care pentru anumiți
//clienți restaurantul nu are în baza de date numărul de telefon, să se trimită
//notificarea prin email. În cazul clienților pentru care nu există nici numărul
//        de telefon, nici adresa de mail, se trimite managerului restaurantului
//o notificare cu numele clientului pentru care nu există date de contact.

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Maria", null, "maria@gmail.com");
        Client client2 = new Client("Maria", null, null);
        Client client3 = new Client("Maria", "07343245543", null);

        NotificatorBaza notificatorSms = new NotificareSMS();
        NotificatorBaza notificatorEmail = new NotificareEmail();
        NotificatorBaza notificareManager = new NotificareManager();

        notificatorSms.setSuccesor(notificatorEmail);
        notificatorEmail.setSuccesor(notificareManager);

        notificatorSms.notificaClient(client1);
        notificatorSms.notificaClient(client2);
        notificatorSms.notificaClient(client3);
    }
}