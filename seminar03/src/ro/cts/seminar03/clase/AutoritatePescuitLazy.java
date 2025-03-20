package ro.cts.seminar03.clase;

// clasa implementeaza patternul Singleton folosind lazy
// instanta este creata doar cand este ceruta pentru PRIMA DATA
public class AutoritatePescuitLazy {
    private String denumire;
    private String website;
    private int nrAngajati;
    private int nrAutorizatiiEmise;

    // instanta initializata NULL
    private static AutoritatePescuitLazy instance = null;

    // tot constructor privat pentru prevenirea crearulor de instante noi
    private AutoritatePescuitLazy(String denumire, String website, int nrAngajati, int nrAutorizatiiEmise) {
        this.denumire = denumire;
        this.website = website;
        this.nrAngajati = nrAngajati;
        this.nrAutorizatiiEmise = nrAutorizatiiEmise;
    }

    // metoda statica sincronizata pentru a obtine instanta (thread-safe)
    // instanta este creata doar cand getInstance() este apelata pentru prima data
    // sync: pentru a fi sigura in mediile multi-threaded
    public synchronized static AutoritatePescuitLazy getInstance(String denumire, String website, int nrAngajati, int nrAutorizatiiEmise) {
        if (instance == null) {
            instance = new AutoritatePescuitLazy(denumire, website, nrAngajati, nrAutorizatiiEmise);
        }
        return instance;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void angajeaza(int nrAngajati) {
        this.nrAngajati += nrAngajati;
    }

    public void concediaza(int nrAngajati) {
        this.nrAngajati -= nrAngajati;
    }

    public void emiteAutorizatie(String numePersoana) {
        this.nrAutorizatiiEmise++;
        System.out.println("A fost emisa o autorizatie pentru " + numePersoana);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutoritatePescuitLazy{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", website='").append(website).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append(", nrAutorizatiiEmise=").append(nrAutorizatiiEmise);
        sb.append('}');
        return sb.toString();
    }
}
