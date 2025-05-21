package clase;

public class PlataFizic implements CardBancar{
    private float totalPlata;

    public PlataFizic(float totalPlata) {
        this.totalPlata = totalPlata;
    }

    @Override
    public void efectueazaPlataCard() {
        System.out.println("Plata se face fizic cu total de plata: " + totalPlata);
    }
}
