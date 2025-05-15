package ro.cts.clase;

public class Autobuz extends MijlocTransport{
    @Override
    public void notificaCalator(Calator calator) {
        if(calator.getDistantaDeParcurs() >= 3 && calator.getDistantaDeParcurs() <= 5){
            System.out.println("Este recomandat sa mergeti cu autobuzul.");
        }
        else {
            super.getMijlocTransport().notificaCalator(calator);
        }
    }
}
