package Main;

import java.util.List;

// instanța este creată doar atunci când ai nevoie de ea
// la primul apel al metodei getInstance()

public class AgentieLazyInitialization {
    private String numeAgentie;
    private float capital;
    private int numarAngajati;
    private String codFiscal;
    private List<String> listaServicii;

    private static AgentieLazyInitialization instance = null;

    private AgentieLazyInitialization(String numeAgentie, float capital, int numarAngajati, String codFiscal, List<String> listaServicii) {
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
        return "Main.AgentieEagerInitialization{" +
                "numeAgentie='" + numeAgentie + '\'' +
                ", capital=" + capital +
                ", numarAngajati=" + numarAngajati +
                ", codFiscal='" + codFiscal + '\'' +
                ", listaServicii=" + listaServicii +
                '}';
    }

    public static AgentieLazyInitialization getInstance(String numeAgentie, float capital, int numarAngajati, String codFiscal, List<String> listaServicii) {
        if (instance == null) {
            instance = new AgentieLazyInitialization(numeAgentie, capital, numarAngajati, codFiscal, listaServicii);
        }
        return instance;
    }
}
