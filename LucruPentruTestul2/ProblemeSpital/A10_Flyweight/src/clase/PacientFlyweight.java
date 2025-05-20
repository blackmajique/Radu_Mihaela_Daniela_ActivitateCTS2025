package clase;

import java.util.HashMap;

public class PacientFlyweight {
    private HashMap<String, IPacient> colectiePacienti;

    public PacientFlyweight() {
        this.colectiePacienti = new HashMap<String, IPacient>();
    }

    public IPacient getPacient(String email) throws Exception{
        IPacient pacient = colectiePacienti.get(email);
        if (pacient == null) {
            throw new Exception("Colectia este goala");
        }
        return pacient;
    }

    public IPacient getPacient(String nume, String nrTelefon, String adresaEmail) {
        IPacient pacient = colectiePacienti.get(adresaEmail);
        if (pacient == null) {
            pacient = new Pacient(nume, nrTelefon, adresaEmail);
            colectiePacienti.put(adresaEmail, pacient);
        }
        return pacient;
    }
}
