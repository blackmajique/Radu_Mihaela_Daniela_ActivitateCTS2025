package clase;

import java.util.HashMap;

public class FlyweightClient {
    private HashMap<String, IClient> colectieClienti;

    public FlyweightClient() {
        this.colectieClienti = new HashMap<String, IClient>();
    }

    public IClient getClienti(String nrTelefon) throws Exception {
        IClient client = colectieClienti.get(nrTelefon);
        if (client == null) {
            throw new Exception("Nu exista clientul cu acest nr de telefon");
        }
        return client;
    }

    public IClient getClient(String nume, String nrTelefon, String adresaMail) {
        IClient client = colectieClienti.get(nrTelefon);
        if (client == null) {
            client = new Client(nume, nrTelefon, adresaMail);
            colectieClienti.put(nrTelefon, client);
        }
        return client;
    }
}
