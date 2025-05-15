package ro.cts.clase;

public class Troleibuz extends MijlocTransport{
    @Override
    public void notificaCalator(Calator calator) {
        if(calator.getDistantaDeParcurs() <= 3) {
            System.out.println("Este recomandat sa mergeti cu troleibuzul.");
        } else {
            super.getMijlocTransport().notificaCalator(calator);
        }
    }
}
