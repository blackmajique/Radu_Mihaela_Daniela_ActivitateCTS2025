package cts.clase;

public class CardCalatorie implements IMetodaPlata {
    private int nrCalatorii;

    public CardCalatorie(int nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
    }

    @Override
    public void plateste(float pretBilet) {
        if(nrCalatorii > 0) {
            System.out.println("Am platit cu cardul o calatorie");
            nrCalatorii--;
        }
        else {
            System.out.println("Nu ai calatorii ramase");
        }
    }
}
