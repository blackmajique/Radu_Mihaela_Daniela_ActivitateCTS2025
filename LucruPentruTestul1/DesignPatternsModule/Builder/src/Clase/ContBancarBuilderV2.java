package Clase;

public class ContBancarBuilderV2 implements IBuilder{
    private String detinator;
    private final double sumaBlocata;
    private double suma;
    private final String moneda;
    private boolean cardAtasat;
    private boolean internetBanking;
    private boolean contSalariu;

    public ContBancarBuilderV2() {
        this.moneda = "EUR";
        this.sumaBlocata = 0;
    }

    public ContBancarBuilderV2 setDetinator(String detinator) {
        this.detinator = detinator;
        return this;
    }

    public ContBancarBuilderV2 setSuma(double suma) {
        this.suma = suma;
        return this;
    }

    public ContBancarBuilderV2 setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
        return this;
    }

    public ContBancarBuilderV2 setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
        return this;
    }

    public ContBancarBuilderV2 setContSalariu(boolean contSalariu) {
        this.contSalariu = contSalariu;
        return this;
    }

    @Override
    public ContBancar build() {
        ContBancar cont=new ContBancar(detinator, sumaBlocata, suma, moneda, cardAtasat, internetBanking, contSalariu);
        return cont;
    }
}
