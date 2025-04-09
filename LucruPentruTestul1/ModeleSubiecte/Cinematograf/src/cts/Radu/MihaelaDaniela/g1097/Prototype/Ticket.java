package cts.Radu.MihaelaDaniela.g1097.Prototype;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class Ticket implements ITicket{
    private String titluFilm;
    private String regieFilm;
    private List<String> actoriPrincipali;
    private String companieProducatoare;
    private String descriere;
    private String urlImaginePlasareProduse;
    private LocalDate dataRezervarii;
    private int locuriRezervate;

    public Ticket() {
        this.titluFilm = "Necunoscut";
        this.regieFilm = "Necunoscut";
        this.actoriPrincipali = null;
        this.companieProducatoare = "Necunoscut";
        this.descriere = "Necunoscut";
        this.urlImaginePlasareProduse = "Necunoscut";
    }

    public Ticket(String titluFilm, String regieFilm, List<String> actoriPrincipali, String companieProducatoare, String descriere, String urlImaginePlasareProduse, LocalDate dataRezervarii, int locuriRezervate) {
        this.titluFilm = titluFilm;
        this.regieFilm = regieFilm;
        this.actoriPrincipali = actoriPrincipali;
        this.companieProducatoare = companieProducatoare;
        this.descriere = descriere;
        this.urlImaginePlasareProduse = urlImaginePlasareProduse;
        this.dataRezervarii = dataRezervarii;
        this.locuriRezervate = locuriRezervate;
    }

    public void setDataRezervarii(LocalDate dataRezervarii) {
        this.dataRezervarii = dataRezervarii;
    }

    public void setLocuriRezervate(int locuriRezervate) {
        this.locuriRezervate = locuriRezervate;
    }

    @Override
    public Ticket clone(LocalDate dataRezervare, int locuriRezervate) {
        Ticket ticket = new Ticket(titluFilm, regieFilm, actoriPrincipali, companieProducatoare, descriere, urlImaginePlasareProduse, dataRezervarii, locuriRezervate);
        return ticket;
    }

    @Override
    public void afisareDetaliiRezervareBilet() {
        System.out.println("Ticket{" +
                "titluFilm='" + titluFilm + '\'' +
                ", regieFilm='" + regieFilm + '\'' +
                ", actoriPrincipali=" + actoriPrincipali +
                ", companieProducatoare='" + companieProducatoare + '\'' +
                ", descriere='" + descriere + '\'' +
                ", urlImaginePlasareProduse='" + urlImaginePlasareProduse + '\'' +
                ", dataRezervarii=" + dataRezervarii +
                ", locuriRezervate=" + locuriRezervate +
                '}');
    }
}
