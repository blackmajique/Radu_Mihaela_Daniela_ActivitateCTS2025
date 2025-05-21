package clase;

public class PlataOnline implements CardBancar{
    private String numeMagazinPlata;

    public PlataOnline(String numeMagazinPlata) {
        this.numeMagazinPlata = numeMagazinPlata;
    }

    @Override
    public void efectueazaPlataCard() {
        System.out.println("Plata se face cu cardul catre " + numeMagazinPlata);
    }
}
