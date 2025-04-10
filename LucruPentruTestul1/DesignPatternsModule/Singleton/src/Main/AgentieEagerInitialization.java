package Main;

import java.util.Arrays;
import java.util.List;


// instanta AgentieEagerIntialization este creata imediat - in momentul incarcarii clasei,
// nu cand o cerem noi (nu se asteapta sa fie apelata metoda getInstance()

public class AgentieEagerInitialization {
    private String numeAgentie;
    private float capital;
    private int numarAngajati;
    private String codFiscal;
    private List<String> listaServicii;

    private static final AgentieEagerInitialization instance = new AgentieEagerInitialization();

    private AgentieEagerInitialization() {
        this.numeAgentie = "CalatoriiFrumoase";
        this.capital = 1000;
        this.numarAngajati = 50;
        this.codFiscal = "001";
        this.listaServicii = Arrays.asList("Rezervari", "Consultanta", "Transport", "Cazare");
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
    //    public static Main.AgentieEagerInitialization getInstance(String nume, float capital, String codFiscal, int numarAngajati, List<String> listaServicii) {
//        return instance;
//    }

        public static AgentieEagerInitialization getInstance() {
        return instance;
    }
}
