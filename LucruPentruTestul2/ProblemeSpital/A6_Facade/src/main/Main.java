package main;
//A.6. Pentru internarea unui pacient în spital trebuie verificată
//gravitatea stării pacientului prin intermediul clasei Pacient,
//verificarea confirmării Medicului că trebuie internat,
//verificarea disponibilității unui pat în cameră prin
//intermediul clasei Salon care are lista cu paturile
//libere si ocupate. Spitalul dorește ca personalul
//spitalului să nu fi nevoit să facă aceste verificări
//separat ci să fie dezvoltat un modul care să permită a
//ceastă verificarea facilă a acestor lucruri.

import clase.Pacient;
import clase.SpitalFacade;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Maricia", 7);
        SpitalFacade spitalFacade = new SpitalFacade();

        spitalFacade.verificareStarePacientSiDisponibilitateSpital(pacient);
    }
}