package clase;

import java.util.HashMap;

public class AutobuzLinieFlyweight {
    private HashMap<Integer, ILinie> colectieAutobuzLinie;

    public AutobuzLinieFlyweight() {
        this.colectieAutobuzLinie = new HashMap<Integer, ILinie>();
    }

    public ILinie getLinie(int key) throws Exception{
        ILinie linie = colectieAutobuzLinie.get(key);

        if(linie == null ) {
            throw new Exception("Linia " + key + " nu exista");
        }
        else return linie;
    }

    public ILinie getLinie(int key, int nrLinie, String primaStatie, String ultimaStatie) {
        ILinie linie = colectieAutobuzLinie.get(key);
        if(linie == null ) {
            linie = new Linie(nrLinie, primaStatie, ultimaStatie);
            colectieAutobuzLinie.put(key, linie);
        }
        return linie;
    }
}
