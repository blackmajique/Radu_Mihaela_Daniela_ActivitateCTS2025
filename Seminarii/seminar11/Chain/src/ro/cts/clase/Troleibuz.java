package ro.cts.clase;

public class Troleibuz extends MijlocTransport{
    @Override
    public void notificaCalator(int distanta) {
        if(distanta < 5) {
            System.out.println("Poti merge cu troleibuzul.");
        }
        else {
            super.getUrmatorulMijlocDeTransport().notificaCalator(distanta);
        }
    }
}
