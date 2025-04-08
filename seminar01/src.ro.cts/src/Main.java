

import interfete.iPredabil;
import modele.Curs;
import modele.Persoana;
import modele.Profesor;
import modele.Student;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       List<Student> listaStudenti = new ArrayList<>();

       listaStudenti.add(new Student("Maria", 21, 1));
       listaStudenti.add(new Student("Andrei", 21, 2));

       Curs curs = new Curs("CTS", 5, new Profesor("Zamfiroiu Ionut-Alin",
               35, 1, 8000, 0.2f), listaStudenti);
        float venitProfesor = ((Persoana) curs.getProfesor()).calculareVenit();
        System.out.println(venitProfesor);

        curs.sustineExamen("10-iunie-2025");

        curs.getProfesor().preda();
    }
}