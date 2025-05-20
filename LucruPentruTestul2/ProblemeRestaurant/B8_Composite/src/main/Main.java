package main;

//B.8. Este dorita reprezentarea meniului in cadrul aplicației.
//Meniul conține secțiuni (startere, băuturi, desert, etc.)
//fiecare secțiune poate conține subsecțiuni (sucuri, cafea, etc)
//sau item-uri (, apa plata, apa minerala, etc). Sa se realizeze
//modulul care permite reprezentarea arborescenta a meniului restaurantului.

import clase.Items;
import clase.Sectiuni;
import clase.Structura;
import clase.Subsectiuni;

public class Main {
    public static void main(String[] args) {
        Structura meniu = new Sectiuni("Rata la cuptor");

        Structura bauturaFancy = new Subsectiuni("Cafea cu caramel sarat");
        Structura bauturaFancy2 = new Subsectiuni("Limonada de cactus");

        Structura bauturaBoring = new Items("Apa", 12);
        Structura bauturaBoring2 = new Items("Coca Cola", 15);

        try {
            meniu.adaugaItem(bauturaFancy, bauturaBoring);
            meniu.adaugaItem(bauturaFancy2, bauturaBoring2);
            meniu.printareStructura();

            meniu.stergeItem(bauturaBoring2, bauturaFancy2);
            meniu.printareStructura();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}