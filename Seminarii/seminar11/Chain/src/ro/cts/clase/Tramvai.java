package ro.cts.clase;

public class Tramvai extends MijlocTransport{
    @Override
    public void notificaCalator(int distanta) {
        if(distanta >= 5 && distanta <= 10) {
            System.out.println("Calatorul poate lua tramvaiul");
        }
        else {
            super.getUrmatorulMijlocDeTransport().notificaCalator(distanta);
        }
    }
}
