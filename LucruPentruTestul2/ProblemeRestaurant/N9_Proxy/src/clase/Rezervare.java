package clase;

public class Rezervare implements IRezervare {
    @Override
    public void rezerva(String data, String ora, String numeClient, int nrPersoane) {
        System.out.println("Rezervarea pentru " + numeClient + " este facuta la data de " +
                data + ", la ora " + ora + " pentru nr de persoane: " + nrPersoane);
    }
}
