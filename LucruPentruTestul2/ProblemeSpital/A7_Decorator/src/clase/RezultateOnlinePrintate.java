package clase;

public class RezultateOnlinePrintate extends PrintareRezultate{
    private String mail;

    public RezultateOnlinePrintate(IRezultate rezultate, String mail) {
        super(rezultate);
        this.mail = mail;
    }

    @Override
    public void printareRezultateDecorate() {
        System.out.println("Printare online a rezultatelor la mail-ul: " + mail);
    }
}
