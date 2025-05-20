package main;

import clase.IInternare;
import clase.Internare;
import clase.Pacient;

public class Main {
    public static void main(String[] args) {
        IInternare internare = new Internare("20.03.2025", 14);

        Pacient pacientAsigurat = new Pacient(true, internare);
        Pacient pacientNeasigurat = new Pacient(false, internare);

        pacientAsigurat.internare();
        pacientNeasigurat.internare();
    }
}