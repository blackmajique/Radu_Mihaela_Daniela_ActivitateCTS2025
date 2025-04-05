package Main;

//A.2. În cadrul aplicației personalul spitalului
//este de mai multe tipuri. Acestea sunt salvate
//într-un enum { Brancardier, Asistent, Medic}.
//Să se implementeze modulul care pune la dispoziției
//crearea de obiecte din familia obiectelor PersonalSpital
//in funcție de tipul primit ca parametru.

import Clase.Asistent;
import Clase.Personal;
import Clase.PersonalSpital;
import Clase.SimpleFactory;

public class Main {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory("Andrei", 5000, 500, true);
        Personal personal = factory.getPersonal(PersonalSpital.MEDIC, 100);
        Personal personal1 = factory.getPersonal(PersonalSpital.ASISTENT, 150);
        Personal personal2 = factory.getPersonal(PersonalSpital.BRANCARDIER, 60);

        System.out.println(personal);
        System.out.println(personal1);
        System.out.println(personal2);

    }
}