package Clase;

public class SimpleFactory {
    private final float cantitate;
    private final float pret;

    public SimpleFactory(float cantitate, float pret) {
        this.cantitate = cantitate;
        this.pret = pret;
    }

    public Supa getSupa(Supe supe, float extraSupa, boolean extraTopping) {
        switch (supe) {
            case LEGUME:
                SupaLegume supaLegume = new SupaLegume(cantitate, pret, extraTopping, extraTopping);
                return supaLegume;
            case CIUPERCI:
                SupaCiuperci supaCiuperci = new SupaCiuperci(cantitate, pret, extraTopping, extraSupa, extraSupa);
                return supaCiuperci;
            case VITA:
                SupaVita supaVita = new SupaVita(cantitate, pret, extraTopping, extraTopping);
                return supaVita;
                default:
                    return null;
        }
    }
}
