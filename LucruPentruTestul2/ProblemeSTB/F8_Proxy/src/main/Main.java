package main;

//    F.8. Pentru autobuzele de noapte se doreste ca oprirea
//    in statie sa se faca doar daca exista persoane in autobuz.
//    In caz contrar autobuzul se retrage la autobaza fara sa mai
//    realizeze opriri. Sa se implementeze modul care va permite
//    oprirea in statie a autobuzelor doar daca exista calatori
//    in autobuz.

import clase.IAutobuz;
import clase.OprireInStatie;
import clase.OprireInStatieAutobuzNocturn;

public class Main {
    public static void main(String[] args) {
        IAutobuz autobuz = new OprireInStatie();
        IAutobuz autobuzDeNoapte = new OprireInStatieAutobuzNocturn(autobuz);
        autobuzDeNoapte.oprireInStatie("Nocturn", "Nocturn", 1);
        autobuzDeNoapte.oprireInStatie("13fs", "da", 0);
    }
}