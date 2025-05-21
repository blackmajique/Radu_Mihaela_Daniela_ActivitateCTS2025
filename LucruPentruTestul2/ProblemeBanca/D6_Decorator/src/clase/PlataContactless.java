package clase;

public class PlataContactless extends PlataDecorator{
    private float soldTotal;

    public PlataContactless(CardBancar plataCardBancar) {
        super(plataCardBancar);
    }

    @Override
    public void efectueazaPlataDecorata() {
        System.out.println("Plata este contactless si aveti in total " + soldTotal + " lei ramasi");
    }
}
