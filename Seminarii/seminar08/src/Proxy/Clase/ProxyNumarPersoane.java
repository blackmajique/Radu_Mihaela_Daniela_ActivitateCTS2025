package Proxy.Clase;

public class ProxyNumarPersoane implements IRezervare {
    private IRezervare rezervare;

    public ProxyNumarPersoane(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezerva(String numeClient, int nrPersoane, int ora) {
        if(nrPersoane > 4) {
            rezervare.rezerva(numeClient, nrPersoane, ora);
        }
        else {
            System.out.println("Nu se poate rezerva o masa mai mica de 4 persoane, va asteptam fizic, avem suficiente locuri libere.");
        }
    }
}
