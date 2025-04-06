package Main;

//    4p. Pentru un magazin care produce și vinde Biciclete se dorește implementarea unei aplicații care să ajute
//    la gestionarea fabricării de biciclete. Astfel în cadrul aplicației inginerii au
//    posibilitatea creării obiectelor pentru seturi de biciclete care au mai multe
//    caracteristici, dintre care unele sunt opționale: diametruRoti, tipFrana,
//    cascaProtectie, ochelari, etc. Orice set creat nu mai poate fi modificat urmand
//    sa fie vandut asa cum a fost creat. Să se implementeze modulul care îi va ajuta
//    pe gestionari în procesul de creare al obiectelor de tip Bicicleta. Clasa
//    Bicicleta trebuie sa implementeze interfata IBicicleta.

//    1p. Să se testeze soluția prin crearea a cel puțin patru obiecte
//    prin intermediul modulului implementat

//    4p. Soluția trebuie să permită crearea de Biciclete de diferite
//    tipuri: MTB, Electrica, Trekking. Pentru fiecare tip de bicicleta
//    este folosită o clasă aferentă tipului de bicicletă care implementează
//    interfața IBicicleta. Să se implementeze modulul care îi va ajuta pe
//    inginerii magazinului producator de biciclete în procesul de creare
//    al obiectelor din familia IBicicleta..

//    1p. Să se testeze soluția prin crearea a cel puțin patru
//    obiecte din cel puțin două categorii diferite din familia bicicletelor.

import Clase.Builder.Bicicleta;
import Clase.Builder.BicicletaBuilder;
import Clase.SimpleFactory.Biciclete;
import Clase.SimpleFactory.SimpleFactory;

public class Main {
    public static void main(String[] args) {
        Bicicleta bicicleta = new BicicletaBuilder().setCascaProtectie(true).setOchelari(true).build();
        System.out.println(bicicleta);

        SimpleFactory simpleFactory = new SimpleFactory(true, false);
        Bicicleta bicicleta1 = simpleFactory.getBicicleta(Biciclete.MTB, 15, "O frana buna", 1000);
        bicicleta1.descriere();
    }
}