package Main;

//B. Restaurant
//B.1. Restaurantul servește mai multe tipuri de supe: supă de legume, supă de ciuperci,
//supă de vită, etc. Să se implementeze modulul care permite realizarea de obiecte din
//familia supelor. Tipurile de supă sunt reținute în cadrul unui enum.


import Clase.SimpleFactory;
import Clase.Supa;
import Clase.SupaCiuperci;
import Clase.Supe;

public class Main {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory(300, 5);
        Supa supa = factory.getSupa(Supe.CIUPERCI, 45, true);
        supa.preparareSupa();
    }
}
