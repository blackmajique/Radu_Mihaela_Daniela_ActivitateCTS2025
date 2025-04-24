package Facade.Main;

//B.6. În momentul în care un client vine la restaurant pentru o masă,
// recepționistul trebuie să verifice dacă are masă liberă, apoi
// să verifice dacă acea masă a fost debarasată de la plecarea
// ultimului client, de asemenea trebuie să verifice dacă au
// fost puse șervețele noi pe masă. Managerul restaurantului
// dorește realizarea unui modul care să simplifice munca
// recepționistului și să nu mai fie nevoit să verifice în
// toate locurile ci doar într-un singur loc.

import Facade.Clase.Masa;
import Facade.Clase.Ospatar;
import Facade.Clase.Picolo;
import Facade.Clase.Receptionist;

public class Main {
    public static void main(String[] args) {
        Masa masa1 = new Masa(true, 1, 4);
        Ospatar ospatar = new Ospatar();
        Picolo picolo = new Picolo();

        Masa masa20 = new Masa(true, 20, 2);

        if(masa20.isEsteLibera()) {
            if(picolo.esteDebarasata(masa20)) {
                System.out.println("Masa este libera");
                if(ospatar.esteAranjata(masa20)) {
                    System.out.println("Masa este aranjata, puteti lua loc la masa cu nr. " + masa20.getNumarMasa());
                }
                else {
                    System.out.println("Masa este libera dar nu este aranjata.");
                }
            }
            else {
                System.out.println("Asteptati putin, tocmai se ridica cineva.");
            }
        }
        else {
            System.out.println("Masa nu este disponibila.");
        }

        Receptionist receptionist = new Receptionist();
        System.out.println(receptionist.poateLuaLocLaMasa(masa20));

        Masa masa2 = new Masa(false, 2, 2);
        System.out.println(receptionist.poateLuaLocLaMasa(masa2));
    }
}