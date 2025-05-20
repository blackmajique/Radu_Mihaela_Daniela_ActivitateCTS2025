package clase;

public class OprireInStatie implements IAutobuz {
    @Override
    public void oprireInStatie(String numarAutobuz, String numeStatie, int nrCalatori) {
        System.out.println("Autobuz " + numarAutobuz + ": " + numeStatie + " " + nrCalatori);
    }
}
