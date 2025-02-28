package modele;

import interfete.iPredabil;

public class Asistent extends Persoana implements iPredabil {
    private int idAsistent;
    private float salariu;

    public void setIdAsistent(int idAsistent) {
        this.idAsistent = idAsistent;
    }

    public int getIdAsistent() {
        return idAsistent;
    }

    public Asistent(String nume, int varsta, int idAsistent, float salariu) {
        super(nume, varsta);
        this.idAsistent = idAsistent;
        this.salariu = salariu;
    }

    public Asistent() {
        super("ro.cts.seminar01.modele.Asistent", 25);
        this.idAsistent = 0;
        this.salariu = 0;
    }

    @Override
    public void preda() {

    }

    @Override
    public float calculareVenit() {
        return salariu;
    }
}
