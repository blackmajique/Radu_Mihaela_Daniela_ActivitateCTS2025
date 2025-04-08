package ro.cts.seminar03.clase;

// clasa implementeaza Singleton folosind initializarea eager
// instanta este creata imediat, chiar daca nu este folosita
public class AutoritatePescuitEager {
    private String denumire;
    private String website;
    private int nrAngajati;
    private int nrAutorizatiiEmise;

    // instanta este creata imediat
    private static final AutoritatePescuitEager instance = new AutoritatePescuitEager("ANPA", "www.anpa.ro", 10, 100);

    // constructor privat pentru a preveni crearea unei noi instante
    private AutoritatePescuitEager(String denumire, String website, int nrAngajati, int nrAutorizatiiEmise) {
        this.denumire = denumire;
        this.website = website;
        this.nrAngajati = nrAngajati;
        this.nrAutorizatiiEmise = nrAutorizatiiEmise;
    }

    // metoda statica pentru a returna instanta
    public static AutoritatePescuitEager getInstance() {
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
        String sb = "AutoritatePescuitEager{" + "denumire='" + denumire + '\'' +
                ", website='" + website + '\'' +
                ", nrAngajati=" + nrAngajati +
                ", nrAutorizatiiEmise=" + nrAutorizatiiEmise +
                '}';
        return sb;
    }
}
