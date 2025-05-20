package main;

//    A.10. Pentru fiecare internare trebuie să se rețină
//    informații cu privire la pacientul internat precum:
//    nume, număr de telefon, adresă, etc, precum și informațiile
//    despre salonul unde este internat: număr salon, număr pat,
//    număr zile spitalizare, etc. Astfel, dacă un pacient este
//    internat de mai multe ori de-a lungul timpului, informațiile
//    despre acesta sunt aceleași și se repetă, ocupând foarte multă
//    memorie. Să se implementeze modulul de memorare al tuturor
//    internărilor astfel încât să nu ocupe memorie foarte multă.

import clase.IPacient;
import clase.Pacient;
import clase.Salon;
import clase.PacientFlyweight;

public class Main {
    public static void main(String[] args) {
        PacientFlyweight fabrica = new PacientFlyweight();

        try {
            IPacient pacient1 = new Pacient("Georgel", "222222222", "ada@gmail.com");
            IPacient pacient2 = new Pacient("MAricica", "222222222", "ada@gmail.com");

            Salon internare1 = new Salon(1,  11, 1);
            Salon internare2 = new Salon(2,  12, 2);

            pacient2.descriePacient(internare1);
            pacient2.descriePacient(internare2);

            fabrica.getPacient("Faura", "12346778", "ada@gmail.com");
            fabrica.getPacient("ada@gmail.com");
            pacient2.descriePacient(internare1);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}