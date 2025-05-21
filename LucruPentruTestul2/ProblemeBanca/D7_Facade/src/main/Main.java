package main;

//    7. Banca dorește simplificarea procesului de creare a
//    unui cont. În momentul de față pentru crearea unui
//    cont un operator de la bancă trebuie să verifice
//            vârsta persoanei, să verifice dacă este urmărit
//    de poliție sau dacă are creanțe la alte bănci. Să se
//    realizeze un modul pentru simplificarea procesului pentru operator.

import clase.CreareCont;

public class Main {
    public static void main(String[] args) {
        CreareCont cont1 = new CreareCont();
        cont1.creareCont("MAria", 18, true, true);
    }
}