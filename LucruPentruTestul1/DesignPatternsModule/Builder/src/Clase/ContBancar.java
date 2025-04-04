package Clase;

public class ContBancar {
    private String detinator;
    private double sumaBlocata;
    private double sumaContBancar;
    private String moneda;
    private boolean cardAtasat;
    private boolean internetBanking;
    private boolean contSalariu;

    public ContBancar() {
    }

    public ContBancar(String detinator, double sumaBlocata, double sumaContBancar, String moneda, boolean cardAtasat, boolean internetBanking, boolean contSalariu) {
        this.detinator = detinator;
        this.sumaBlocata = sumaBlocata;
        this.sumaContBancar = sumaContBancar;
        this.moneda = moneda;
        this.cardAtasat = cardAtasat;
        this.internetBanking = internetBanking;
        this.contSalariu = contSalariu;
    }

    @Override
    public String toString() {
        return "ContBancar{" +
                "detinator='" + detinator + '\'' +
                ", sumaBlocata=" + sumaBlocata +
                ", sumaContBancar=" + sumaContBancar +
                ", moneda='" + moneda + '\'' +
                ", cardAtasat=" + cardAtasat +
                ", internetBanking=" + internetBanking +
                ", contSalariu=" + contSalariu +
                '}';
    }

    public String getDetinator() {
        return detinator;
    }

    public void setDetinator(String detinator) {
        this.detinator = detinator;
    }

    public double getSumaBlocata() {
        return sumaBlocata;
    }

    public void setSumaBlocata(double sumaBlocata) {
        this.sumaBlocata = sumaBlocata;
    }

    public double getSumaContBancar() {
        return sumaContBancar;
    }

    public void setSumaContBancar(double sumaContBancar) {
        this.sumaContBancar = sumaContBancar;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public boolean isCardAtasat() {
        return cardAtasat;
    }

    public void setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
    }

    public boolean isInternetBanking() {
        return internetBanking;
    }

    public void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }

    public boolean isContSalariu() {
        return contSalariu;
    }

    public void setContSalariu(boolean contSalariu) {
        this.contSalariu = contSalariu;
    }
}
