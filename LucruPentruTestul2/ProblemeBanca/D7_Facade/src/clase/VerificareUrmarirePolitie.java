package clase;

public class VerificareUrmarirePolitie {
    private boolean esteUrmaritDePolitie;

    public VerificareUrmarirePolitie(boolean esteUrmaritDePolitie) {
        this.esteUrmaritDePolitie = esteUrmaritDePolitie;
    }

    public boolean verificareUrmaritDePolitie() {
        if(!esteUrmaritDePolitie) {
            return true;
        }
        return false;
    }
}
