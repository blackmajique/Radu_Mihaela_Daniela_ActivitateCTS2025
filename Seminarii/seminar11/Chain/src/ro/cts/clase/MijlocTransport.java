package ro.cts.clase;

public abstract class MijlocTransport {
    private MijlocTransport urmatorulMijlocDeTransport;

    public void setMijlocTransport(MijlocTransport mijlocTransport) {
        this.urmatorulMijlocDeTransport = mijlocTransport;
    }

    public MijlocTransport getUrmatorulMijlocDeTransport() {
        return urmatorulMijlocDeTransport;
    }

    public abstract void notificaCalator(int distanta);
}
