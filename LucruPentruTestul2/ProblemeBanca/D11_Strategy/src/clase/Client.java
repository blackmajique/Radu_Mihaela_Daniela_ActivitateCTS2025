package clase;

public class Client implements TipClient{
    private TipClient tipClient;

    public Client(TipClient tipClient) {
        this.tipClient = tipClient;
    }

    public void setTipClient(TipClient tipClient) {
        this.tipClient = tipClient;
    }

    @Override
    public void afisareClient() {
        System.out.println("Clientul este de tipul ");
        tipClient.afisareClient();
    }
}
