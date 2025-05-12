package ro.cts.clase;

public class Autobuz extends MijlocTransport{

    public Autobuz(int nrLinie) {
        super(nrLinie);
    }

    @Override
    public void pleacaDeLaCapat() {
       trimitereMesaj("Autobuzul cu nr. " + this.getNrLinie() +
                   " a plecat de la capat.");
    }

    public void schimbaTraseu() {
        trimitereMesaj("Autobuzul cu nr.  " + this.getNrLinie() +
                " va circula astazi prin Bulevardul Balcescu si nu va mmai" +
                " opri astazi la Piata Romana.");

    }
}
