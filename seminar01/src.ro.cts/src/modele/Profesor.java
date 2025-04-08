package modele;


import interfete.iPredabil;

public class Profesor extends Persoana implements iPredabil {
    private int idProfesor;
    private final float salariu;
    private final float sporVechime;

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    @Override
    public String getNume() {
        return super.getNume();
    }

    @Override
    public int getVarsta() {
        return super.getVarsta();
    }

    @Override
    public void setNume(String nume) {
        super.setNume(nume);
    }

    @Override
    public void setVarsta(int varsta) {
        super.setVarsta(varsta);
    }

    public Profesor(String nume, int varsta, int idProfesor, float salariu, float sporVechime) {
        super(nume, varsta);
        this.idProfesor = idProfesor;
        this.salariu = salariu;
        this.sporVechime = sporVechime;
    }

    public Profesor() {
        super("ro.cts.seminar01.modele.Profesor", 35);
        this.idProfesor = 0;
        this.salariu = 0;
        this.sporVechime = 0;
    }

    @Override
    public void preda() {
        System.out.println("Profesorul " + this.getNume() + " in varsta de " + varsta + " preda la curs.");
    }

    @Override
    public float calculareVenit() {
        return salariu + sporVechime * salariu;
    }
}
