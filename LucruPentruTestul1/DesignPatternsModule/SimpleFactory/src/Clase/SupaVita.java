package Clase;

public class SupaVita extends Supa{
    private boolean areArdeiIute;


    public SupaVita(float cantitate, float pret, boolean areSmantana, boolean areArdeiIute) {
        super(cantitate, pret, areSmantana);
        this.areArdeiIute = areArdeiIute;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de vita este " + areArdeiIute + " ca vine cu ardei iute.");
    }
}
