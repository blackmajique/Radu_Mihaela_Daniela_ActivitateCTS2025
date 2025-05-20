package main;

//A.7. Spitalul dorește să testeze punerea la dispoziție a rezultatelor prin
//intermediul platformei online ci nu doar printat. Există însă riscul
//să se revină la forma inițială de punere la dispoziția pacienților a
//rezultatelor. Se dorește adăugarea acestei noi funcționalități pentru
//        sistemul software, care să permită revenirea la situația inițială.

import clase.IRezultate;
import clase.RezultateOnlinePrintate;
import clase.RezultateSimplePrintate;

public class Main {
    public static void main(String[] args) {
        IRezultate rezultate = new RezultateSimplePrintate("Stafilococ auriu", "Raducan Anca");
        rezultate.printareRezultate();

        IRezultate rezultateOnline = new RezultateOnlinePrintate(rezultate, "anca@gmail.com");
        rezultateOnline.printareRezultate();
    }
}