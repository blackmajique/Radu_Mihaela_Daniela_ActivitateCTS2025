package cts.Radu.MihaelaDaniela.g1097.Prototype;

import java.time.LocalDate;

public interface ITicket {
    Ticket clone(LocalDate dataRezervare, int locuriRezervate);
    void afisareDetaliiRezervareBilet();
}
