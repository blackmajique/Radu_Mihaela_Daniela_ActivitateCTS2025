package clase;

public class OprireInStatieAutobuzNocturn implements IAutobuz {
    private IAutobuz autobuz;

    public OprireInStatieAutobuzNocturn(IAutobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void oprireInStatie(String numarAutobuz, String numeStatie, int nrCalatori) {
        if(nrCalatori > 0) {
            autobuz.oprireInStatie(numarAutobuz, numeStatie, nrCalatori);
            System.out.println("Autobuzul opreste in statie");
        }
        else {
            System.out.println("Autobuzul nu opreste in statie, nu exista calatori");
        }
    }
}
