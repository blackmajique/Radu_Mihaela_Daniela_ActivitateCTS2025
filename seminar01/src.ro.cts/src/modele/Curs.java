package modele;

import interfete.iPersoana;
import interfete.iPredabil;

import java.util.ArrayList;
import java.util.List;

public class Curs {
    private String numeCurs;
    private int credite;
    private iPredabil profesor;
    private List<Student> studenti;

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
        StringBuilder sb = new StringBuilder("La cursul ");
        sb.append(this.getNumeCurs())
                .append( " cu ")
                .append(this.getCredite())
                .append(" puncte credit, predat de ")
                .append(((iPersoana)this.profesor).getNume())
                .append(" are ")
                .append(studenti.size())
                .append(" studenti.");
        System.out.println(sb);
    }

    public void sustineExamen(String data) {
        StringBuilder sb = new StringBuilder("Pe data ")
                .append(data)
                .append(", cadrul didactic ")
                .append(((iPersoana)this.profesor).getNume())
                .append(" sustine examen cu urmatorii studenti: ");
        System.out.println(sb.toString());
        studenti.forEach(s -> System.out.println(s.getNume()));
    }
}
