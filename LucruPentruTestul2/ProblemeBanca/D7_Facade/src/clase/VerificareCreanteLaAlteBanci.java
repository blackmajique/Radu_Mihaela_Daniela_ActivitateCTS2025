package clase;

public class VerificareCreanteLaAlteBanci {
    private boolean areCreanteLaAlteBanci;

    public VerificareCreanteLaAlteBanci(boolean areCreanteLaAlteBanci) {
        this.areCreanteLaAlteBanci = areCreanteLaAlteBanci;
    }

    public boolean verificareCreanteLaAlteBanci() {
        return !areCreanteLaAlteBanci;
    }
}
