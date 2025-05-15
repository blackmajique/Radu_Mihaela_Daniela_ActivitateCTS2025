package ro.cts.clase;

public class Metrou extends MijlocTransport{
    @Override
    public void notificaCalator(int distanta) {
        if(distanta > 10) {
            System.out.println("Calatorul poate lua metroul");
        }
    }
}
