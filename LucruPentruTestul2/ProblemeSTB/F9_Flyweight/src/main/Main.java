package main;

//    F.9. Pentru fiecare AutobuzLinie sunt salvate in memorie,
//    informatii precum: model autobuz, an fabricatie, numar
//    locuri, numar linie,prima statie, ultima statie. Aceste
//    informatii sunt salvate pentru fiecare AutobuzLinie din oras.
//    Se doreste implementarea unui modul care sa asigure gestiunea
//    in mod optim a memoriei, tinandu-se cont de faptul ca anumite
//    informatii sunt redundante, deoarece pe o linie vor merge mai
//    multe autobuze.

import clase.Autobuz;
import clase.AutobuzLinieFlyweight;
import clase.ILinie;
import clase.Linie;

public class Main {
    public static void main(String[] args) {
        AutobuzLinieFlyweight linieFlyweight = new AutobuzLinieFlyweight();

        try {
            ILinie linie = new Linie(1, "Lizeanu", "Ziaru");

            Autobuz autobuz = new Autobuz("Ada", 2008, 30);
            Autobuz autobuz1 = new Autobuz("MAra", 2014, 40);

            linie.descriere(autobuz);

            linieFlyweight.getLinie(1, 12, "GAga", "MAka").descriere(autobuz);

        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}