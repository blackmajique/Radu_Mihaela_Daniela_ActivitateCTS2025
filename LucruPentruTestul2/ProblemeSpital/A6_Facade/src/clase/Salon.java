package clase;

public class Salon {
    private int nrSalon;
    private int nrPaturiOcupate;
    private int nrPaturiLibere;

    public Salon(int nrSalon, int nrPaturiOcupate, int nrPaturiLibere) {
        this.nrSalon = nrSalon;
        this.nrPaturiOcupate = nrPaturiOcupate;
        this.nrPaturiLibere = nrPaturiLibere;
    }

    public boolean verificareDisponibilitatePat() {
        if(nrPaturiLibere > nrPaturiOcupate) {
            return true;
        }
        return false;
    }
}
