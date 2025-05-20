package clase;

public class Usa {
    private String nume;

    public Usa(String nume) {
        this.nume = nume;
    }

    public void deschidereUsaNormala() {
        System.out.println("Usa " + nume + " este deschisa normal");
    }

    public void deschidereUsaFortat(){
        System.out.println("Usa " + nume + " este deschisa fortat");
    }
}
