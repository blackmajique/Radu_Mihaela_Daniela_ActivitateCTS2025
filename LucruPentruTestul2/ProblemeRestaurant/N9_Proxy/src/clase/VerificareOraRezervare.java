package clase;

public class VerificareOraRezervare implements IRezervare {
    private IRezervare rezervare;

    public VerificareOraRezervare(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezerva(String data, String ora, String numeClient, int nrPersoane) {
        if(nrPersoane >= 4) {
            System.out.println("Rezervarea este efectuata");
            rezervare.rezerva(data, ora, numeClient, nrPersoane);
        }
        else {
            System.out.println("Va puteti prezenta direct la locatie, nu e nevoie de rezervare");
        }
    }
}
