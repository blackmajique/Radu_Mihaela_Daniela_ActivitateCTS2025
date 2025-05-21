package clase;

public class VerificareVarstaPersoana {
    private int varsta;

    public VerificareVarstaPersoana(int varsta) {
        this.varsta = varsta;
    }

    public boolean verificareVarstaPersoana() {
        if(varsta >= 18) {
            return true;
        }
        return false;
    }
}
