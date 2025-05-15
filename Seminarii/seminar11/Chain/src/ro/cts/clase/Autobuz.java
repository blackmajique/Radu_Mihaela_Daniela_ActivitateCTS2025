package ro.cts.clase;

public class Autobuz extends MijlocTransport{
    @Override
    public void notificaCalator(int distanta) {
        if(distanta >= 3 && distanta <= 5) {
            System.out.println("Calatorul poate lua autobuzul");
        }
        else {
            super.getUrmatorulMijlocDeTransport().notificaCalator(distanta);
        }
    }
}
