package Proxy.Clase;

public class ProxyOraRezervare implements IRezervare{
    IRezervare rezervare;

    public ProxyOraRezervare(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezerva(String numeClient, int nrPersoane, int ora) {
        if(ora > 16) {
            rezervare.rezerva(numeClient, nrPersoane, ora);
        }
        else {
            System.out.println("Va asteptam in restaurant, nu e nevoie de rezervare");
        }
    }
}
