package ro.cts.clase;

public abstract class MijlocTransport {
    private MijlocTransport mijlocTransport;

    public MijlocTransport getMijlocTransport() {
        return mijlocTransport;
    }

    public void setMijlocTransport(MijlocTransport mijlocTransport) {
        this.mijlocTransport = mijlocTransport;
    }

    public abstract void notificaCalator(Calator calator);
}
