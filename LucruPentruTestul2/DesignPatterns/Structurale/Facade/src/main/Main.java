package main;

//B.6. În momentul în care un client vine la restaurant pentru o masă,
//recepționistul trebuie să verifice dacă are masă liberă, apoi să
//verifice dacă acea masă a fost debarasată de la plecarea ultimului
//client, de asemenea trebuie să verifice dacă au fost puse șervețele
//noi pe masă. Managerul restaurantului dorește realizarea unui modul
//care să simplifice munca recepționistului și să nu mai fie nevoit
//să verifice în toate locurile ci doar într-un singur loc.

import clase.Facade;
import clase.Masa;

public class Main {
    public static void main(String[] args) {
        Masa masa20 = new Masa(true, 20, 2);

        Facade facade = new Facade();
        System.out.println(facade.poateLuaLocLaMasa(masa20));
    }
}