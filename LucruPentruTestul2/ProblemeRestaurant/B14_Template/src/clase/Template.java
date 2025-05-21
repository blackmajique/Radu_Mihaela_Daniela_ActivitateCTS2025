package clase;

public abstract class Template {

    public final void ocupaMasa(Rezervare rezervare) {
        curataMasa();
        aseazaServetele();
        aseazaTacamuri();
        if(!invitaPersoane(rezervare.getNrPersoane())) {
            System.out.println("Capacitate maxima");
        }
        else{
            System.out.println("Puteti lua loc");
        }
    }

    public abstract void curataMasa();
    public abstract void aseazaServetele();
    public abstract void aseazaTacamuri();
    public abstract boolean invitaPersoane(int nrPersoane);

}
