
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

import Builder.Bicicleta;
import Builder.BicicletaBuilder;

public class Main {
    public static void main(String[] args) {
        Bicicleta bicicleta1 = new BicicletaBuilder()
                .setAreCascaDeProtectie(true)
                .setAreOchelari(true)
                .setTipFrana("Disc")
                .setDiametruRoti(44.55f)
                .build();

        Bicicleta bicicleta2 = new BicicletaBuilder()
                .setAreCascaDeProtectie(false)
                .setTipFrana("V-brake")
                .build();

        Bicicleta bicicleta3 = new BicicletaBuilder()
                .setAreOchelari(true)
                .setTipFrana("Disc")
                .build();

        Bicicleta bicicleta4 = new BicicletaBuilder()
                .setDiametruRoti(40.0f)
                .build();

        System.out.println(bicicleta1);
        System.out.println(bicicleta2);
        System.out.println(bicicleta3);
        System.out.println(bicicleta4);


    }
}