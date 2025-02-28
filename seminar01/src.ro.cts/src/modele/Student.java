package modele;

public class Student extends Persoana {
    private int idStudent;

    public Student() {
        super("ro.cts.seminar01.modele.Student", 18);
        this.idStudent = 0;
    }

    public Student(String nume, int varsta, int idStudent) {
        super(nume, varsta);
        this.idStudent = idStudent;
    }

    public Student(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
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

    @Override
    public float calculareVenit() {
        return 0;
    }

}
