package ro.cts.seminar03.main;


import ro.cts.seminar03.SingletonRegistry.AutoritatePescuit;
import ro.cts.seminar03.SingletonRegistry.Autorizatie;

public class MainRegistry {
    public static void main(String[] args) {
        AutoritatePescuit autoritatePescuit = AutoritatePescuit.getInstance();
        Autorizatie autorizatie = autoritatePescuit.emiteAutorizatie("pescar");
        System.out.println(autorizatie.toString());

    }
}
