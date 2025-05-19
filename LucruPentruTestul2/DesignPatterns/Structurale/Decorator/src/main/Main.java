package main;

//B.7. Cu ocazia sărbătorilor de sfârșit de an managerul restaurantului
//dorește ca atunci când este printat o notă să se printeze și o
//felicitare de la Mulți ani pentru client. Se dorește adăugarea
//acestei noi funcționalități pentru clasa NotaDePlata la printare.

import clase.NodaPlata;
import clase.NotaDeCraciun;
import clase.NotaDePlata;

public class Main {
    public static void main(String[] args) {
        NodaPlata nodaPlata1 = new NotaDePlata(500);
        NodaPlata nodaPlata2 = new NotaDePlata(200);

        nodaPlata1.printareMesaj();

        NodaPlata nodaPlata3 = new NotaDeCraciun(nodaPlata1);
        nodaPlata3.printareMesaj();
    }
}