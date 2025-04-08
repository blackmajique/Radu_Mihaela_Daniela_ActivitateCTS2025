package modele;

import interfete.iPersoana;
import interfete.iPredabil;

import java.util.ArrayList;
import java.util.List;

public class Curs {
    private String numeCurs;
    private int credite;
    private final iPredabil profesor;
    private final List<Student> studenti;

    public Curs(String numeCurs, int credite, iPredabil profesor, List<Student> studenti) {
        this.numeCurs = numeCurs;
        this.credite = credite;
        this.profesor = profesor;
        this.studenti = studenti;
    }

    public Curs() {
        this.numeCurs = "CTS";
        this.credite = 5;
        this.profesor = new Profesor();
        this.studenti = new ArrayList<>();
    }

    public iPredabil getProfesor() {
        return profesor;
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public void setNumeCurs(String numeCurs) {
        this.numeCurs = numeCurs;
    }

    public int getCredite() {
        return credite;
    }

    public void setCredite(int credite) {
        this.credite = credite;
    }

    public void afisareDetalii(){
        String sb = "La cursul " + this.getNumeCurs() +
                " cu " +
                this.getCredite() +
                " puncte credit, predat de " +
                ((iPersoana) this.profesor).getNume() +
                " are " +
                studenti.size() +
                " studenti.";
        System.out.println(sb);
    }

    public void sustineExamen(String data) {
        String sb = "Pe data " +
                data +
                ", cadrul didactic " +
                ((iPersoana) this.profesor).getNume() +
                " sustine examen cu urmatorii studenti: ";
        System.out.println(sb);
        studenti.forEach(s -> System.out.println(s.getNume()));
    }
}
