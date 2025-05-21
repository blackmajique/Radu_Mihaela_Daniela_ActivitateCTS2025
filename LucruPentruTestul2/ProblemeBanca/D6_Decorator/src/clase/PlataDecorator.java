package clase;

public abstract class PlataDecorator implements CardBancar{
    private CardBancar plataCardBancar;

    public PlataDecorator(CardBancar plataCardBancar) {
        this.plataCardBancar = plataCardBancar;
    }

    @Override
    public void efectueazaPlataCard() {
        plataCardBancar.efectueazaPlataCard();
        efectueazaPlataDecorata();
    }

    public abstract void efectueazaPlataDecorata();
}
