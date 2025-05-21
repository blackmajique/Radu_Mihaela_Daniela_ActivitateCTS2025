package main;

//    8. Banca ia hotărârea sa se realizeze credite doar în RON,
//    deși în momentul de față oferă posibilitatea creării de
//    conturi în orice monedă. Să se realizeze un nivel intermediar
//    pentru clasa Credit, care să permită realizarea contului doar
//    dacă se cere să fie în RON.

import clase.Cont;
import clase.CreareCont;
import clase.Persoana;

public class Main {
    public static void main(String[] args) {
        Cont cont = new Persoana("Maria");
        cont.creareCont("RON");

        Cont cont1 = new CreareCont(cont);
        cont1.creareCont("EUR");
    }
}