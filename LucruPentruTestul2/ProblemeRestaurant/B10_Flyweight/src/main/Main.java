package main;

//    B.10. Pentru fiecare rezervare trebuie să se rețină
//    informații cu privire la clientul restaurantului
//            precum: nume, număr de telefon, adresă de
//            mail, etc, precum și informațiile despre masa
//    rezervata: număr masa, număr persoane, ora rezervare,
//    etc. Astfel, dacă un client realizează mai multe rezervări,
//    la fiecare rezervare, informațiile despre client sunt aceleași
//    și se repetă, ocupând foarte multă memorie. Să se implementeze
//    modulul de memorare al rezervărilor astfel încât să nu ocupe
//    memorie foarte multă.

import clase.Client;
import clase.FlyweightClient;
import clase.IClient;
import clase.MasaRezervata;

public class Main {
    public static void main(String[] args) {
        FlyweightClient colectieClienti = new FlyweightClient();

        try{

            IClient client1 = colectieClienti.getClient("Andrei", "222222222", "andrei@gmail.com");

            MasaRezervata masa1 = new MasaRezervata(1, 3, "20:00");
            MasaRezervata masa2 = new MasaRezervata(2, 4, "17:00");

            client1.descriereClient(masa1);
            client1.descriereClient(masa2);

            IClient client2 = colectieClienti.getClient("Andrei", "222222222", "andrei@gamil.com");
            System.out.println("Este acelasi client? " + client2.equals(client1));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}