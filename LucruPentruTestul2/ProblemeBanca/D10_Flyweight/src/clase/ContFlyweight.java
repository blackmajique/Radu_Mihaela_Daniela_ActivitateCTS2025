package clase;

import java.util.HashMap;

public class ContFlyweight {
    private HashMap<Integer, IDetaliiCont> colectieContFlyweight;

    public ContFlyweight() {
        this.colectieContFlyweight = new HashMap<Integer, IDetaliiCont>();
    }

    public IDetaliiCont getCont(Integer key) throws Exception{
        IDetaliiCont cont = colectieContFlyweight.get(key);
        if(cont == null) {
            throw new Exception("Colectia e goala");
        }
        else{
            return colectieContFlyweight.get(key);
        }
    }

    public IDetaliiCont getCont(int nrCont, float sumaCont) throws Exception{
        IDetaliiCont cont = colectieContFlyweight.get(nrCont);
        if(cont == null) {
            cont = new DetaliiCont(nrCont, sumaCont);
            colectieContFlyweight.put(nrCont, cont);
        }
        return cont;
    }
}
