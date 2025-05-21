package clase;

public class DetaliiBanca {
    private String numeBanca;
    private String sucursala;

    public DetaliiBanca(String numeBanca, String sucursala) {
        this.numeBanca = numeBanca;
        this.sucursala = sucursala;
    }

    @Override
    public String toString() {
        return "DetaliiBanca{" +
                "numeBanca='" + numeBanca + '\'' +
                ", sumaBanca=" + sucursala +
                '}';
    }
}
