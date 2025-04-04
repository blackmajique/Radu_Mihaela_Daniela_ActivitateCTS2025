import java.util.List;

// thread-safe singleton - asigura ca instanta se creeaza o singura data
// funcționează corect atunci când este accesat simultan de mai multe threaduri (fire de execuție),
// fără să apară erori sau comportamente neașteptate.

public class AgentieThreadSafe {
    private String numeAgentie;
    private float capital;
    private int numarAngajati;
    private String codFiscal;
    private List<String> listaServicii;

    private static AgentieThreadSafe instance = null;

    private AgentieThreadSafe(String numeAgentie, float capital, int numarAngajati, String codFiscal, List<String> listaServicii) {
        this.numeAgentie = numeAgentie;
        this.capital = capital;
        this.numarAngajati = numarAngajati;
        this.codFiscal = codFiscal;
        this.listaServicii = listaServicii;
    }

    public String getNumeAgentie() {
        return numeAgentie;
    }

    public void setNumeAgentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    public float getCapital() {
        return capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public String getCodFiscal() {
        return codFiscal;
    }

    public void setCodFiscal(String codFiscal) {
        this.codFiscal = codFiscal;
    }

    public List<String> getListaServicii() {
        return listaServicii;
    }

    public void setListaServicii(List<String> listaServicii) {
        this.listaServicii = listaServicii;
    }

    @Override
    public String toString() {
        return "AgentieThreadSafe{" +
                "numeAgentie='" + numeAgentie + '\'' +
                ", capital=" + capital +
                ", numarAngajati=" + numarAngajati +
                ", codFiscal='" + codFiscal + '\'' +
                ", listaServicii=" + listaServicii +
                '}';
    }

    public static synchronized AgentieThreadSafe getInstance(String numeAgentie, float capital, int numarAngajati, String codFiscal, List<String> listaServicii) {
        if (instance == null) {
            instance = new AgentieThreadSafe(numeAgentie, capital, numarAngajati,codFiscal, listaServicii);
        }
        return instance;
    }
}
