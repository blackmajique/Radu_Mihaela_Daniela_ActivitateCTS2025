package clase;

public class SistemUsiAutobuz {
    private Usa usaFata;
    private Usa usaMijloc;
    private Usa usaSpate;

    public SistemUsiAutobuz(Usa usaFata, Usa usaMijloc, Usa usaSpate) {
        this.usaFata = new Usa("Fata");
        this.usaMijloc = new Usa("Mijloc");
        this.usaSpate = new Usa("Spate");
    }
}
