package src.ro.cts.clase;

import java.util.HashMap;

public class FabricaPacienti {
    private HashMap<String, PacientAbstract> colectiiPacient;

    public FabricaPacienti() {
        this.colectiiPacient = new HashMap<String, PacientAbstract>();
    }

    public PacientAbstract getPacient(String nrTelefon) throws Exception {
        PacientAbstract pacientAbstract = colectiiPacient.get(nrTelefon);
        if (pacientAbstract == null) {
            throw new Exception();
        }
        return pacientAbstract;
    }

    public PacientAbstract getPacient(String nume, String nrTelefon, String adresaEmail) {
        PacientAbstract pacientAbstract = colectiiPacient.get(nrTelefon);
        if (pacientAbstract == null) {
            pacientAbstract = new Pacient(nume, nrTelefon, adresaEmail);
            colectiiPacient.put(nrTelefon, pacientAbstract);
        }
        return pacientAbstract;
    }
}
