package Main;

import java.util.Arrays;
import java.util.List;

public class AgentieStaticBlock {
    private String numeAgentie;
    private float capital;
    private int numarAngajati;
    private String codFiscal;
    private List<String> listaServicii;

    private static AgentieStaticBlock instance;

    static {
        try {
            instance = new AgentieStaticBlock();
        }
        catch (Exception e) {
            System.out.println("Agentia nu poate fi creata");
        }
    }

    private AgentieStaticBlock() {
        this.numeAgentie = "CalatoriiFrumoase";
        this.capital = 1000;
        this.numarAngajati = 50;
        this.codFiscal = "001";
        this.listaServicii = Arrays.asList("Rezervari", "Consultanta", "Transport", "Cazare");
    }

    @Override
    public String toString() {
        return "Main.AgentieStaticBlock{" +
                "numeAgentie='" + numeAgentie + '\'' +
                ", capital=" + capital +
                ", numarAngajati=" + numarAngajati +
                ", codFiscal='" + codFiscal + '\'' +
                ", listaServicii=" + listaServicii +
                '}';
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

//    public static Main.AgentieStaticBlock getInstance(String numeAgentie, float capital, int numarAngajati, String codFiscal, List<String> listaServicii) {
//        return instance;
//    }

        public static AgentieStaticBlock getInstance() {
        return instance;
    }

}
