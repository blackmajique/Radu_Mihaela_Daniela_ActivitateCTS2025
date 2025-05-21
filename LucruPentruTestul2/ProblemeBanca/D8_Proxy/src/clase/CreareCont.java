package clase;

public class CreareCont implements Cont{
    private Cont cont;

    public CreareCont(Cont cont) {
        this.cont = cont;
    }

    @Override
    public void creareCont(String moneda) {
        if(moneda.equals("RON")) {
            cont.creareCont(moneda);
        }else
        {
            System.out.println("Nu se pot crea conturi in alta moneda decat RON");
        }
    }
}
