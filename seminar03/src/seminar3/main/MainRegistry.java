package seminar3.main;


import seminar3.SingletonRegistry.AutoritatePescuit;
import seminar3.SingletonRegistry.Autorizatie;

public class MainRegistry {
    public static void main(String[] args) {
        AutoritatePescuit autoritatePescuit = AutoritatePescuit.getInstance();
        Autorizatie autorizatie = autoritatePescuit.emiteAutorizatie("pescar");
        System.out.println(autorizatie.toString());

    }
}
