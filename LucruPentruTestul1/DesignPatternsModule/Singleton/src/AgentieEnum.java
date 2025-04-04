import java.util.Arrays;
import java.util.List;

public enum AgentieEnum {
    instance;

    private String numeAgentie;
    private float capital;
    private int numarAngajati;
    private String codFiscal;
    private List<String> listaServicii;

    AgentieEnum() {
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

    public float getCapital() {
        return capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
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
}
