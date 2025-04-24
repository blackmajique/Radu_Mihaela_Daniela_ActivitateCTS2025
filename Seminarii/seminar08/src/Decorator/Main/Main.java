package Decorator.Main;

// B.7. Cu ocazia sărbătorilor de sfârșit de an managerul
// restaurantului dorește ca atunci când este printat o
// notă să se printeze și o felicitare de la Mulți ani
// pentru client. Se dorește adăugarea acestei noi funcționalități
// pentru clasa NotaDePlata la printare.

import Decorator.Clase.*;

public class Main {
    public static void main(String[] args) {
        NotaP nodaDePlata1 = new NodaDePlata(400);
        nodaDePlata1.printare();

        NotaP notaDecorata = new NodaDePlataRevelion(nodaDePlata1);
        notaDecorata.printare();

        NotaP nodaDePlata2 = new NodaDePlata(800);
        NotaP nota = new NotaDePlataCraciun(nodaDePlata2);
        nota.printare();
    }
}
