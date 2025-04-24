package Proxy.Clase;

public class Rezervare implements IRezervare {

    @Override
    public void rezerva(String numeClient, int nrPersoane, int ora) {
        System.out.println("Aveti rezervare pe numele " + numeClient +
                " pentru " + nrPersoane + " persoane " +
                " la ora " + ora);
    }
}
