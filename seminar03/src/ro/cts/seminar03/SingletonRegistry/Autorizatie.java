package ro.cts.seminar03.SingletonRegistry;

// autorizatie emisa de AutorizatiePescuit
public class Autorizatie {
    private final String detinator;
    private final int nrAutorizatie;
    private final String data;

    Autorizatie(String detinator, int nrAutorizatie, String data) {
        this.detinator = detinator;
        this.nrAutorizatie = nrAutorizatie;
        this.data = data;
    }

    @Override
    public String toString() {
        String sb = "Autorizatie{" + "detinator='" + detinator + '\'' +
                ", nrAutorizatie=" + nrAutorizatie +
                ", data='" + data + '\'' +
                '}';
        return sb;
    }
}
