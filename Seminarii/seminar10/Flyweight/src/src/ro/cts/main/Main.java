package src.ro.cts.main;

import src.ro.cts.clase.FabricaPacienti;
import src.ro.cts.clase.PacientAbstract;
import src.ro.cts.clase.Spitalizare;

//A.10. Pentru fiecare internare trebuie să se rețină informații cu privire la pacientul internat precum:
//nume, număr de telefon, adresă, etc, precum și informațiile despre salonul unde este internat:
//        număr salon, număr pat, număr zile spitalizare, etc. Astfel, dacă un pacient este internat de mai
//multe ori de-a lungul timpului, informațiile despre acesta sunt aceleași și se repetă, ocupând foarte
//multă memorie. Să se implementeze modulul de memorare al tuturor internărilor astfel încât să nu
//ocupe memorie foarte multă.

public class Main {
    public static void main(String[] args) throws Exception {
        FabricaPacienti fabricaPacienti = new FabricaPacienti();

        PacientAbstract pacientAbstract = fabricaPacienti.getPacient("Andrei", "07231111111", "fafa@gmail.com");
        Spitalizare spitalizare1 = new Spitalizare(5, 7, 10);
        Spitalizare spitalizare2 = new Spitalizare(5, 9, 9);

        pacientAbstract.afiseazaPacient(spitalizare1);
        pacientAbstract.afiseazaPacient(spitalizare2);

        fabricaPacienti.getPacient("Andrei", "07231111111", "fafa@gmail.com").afiseazaPacient(spitalizare2);
        fabricaPacienti.getPacient("07231111111").afiseazaPacient(spitalizare2);
    }
}