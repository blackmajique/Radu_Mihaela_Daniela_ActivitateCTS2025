package Clase;

public class GPSConnection implements ServiceConnection {
    private final String id;
    private final double latitudine;
    private final double longitudine;

    public GPSConnection(String id, double latitudine, double longitudine) {
        this.id = id;
        this.latitudine = latitudine;
        this.longitudine = longitudine;
    }

    @Override
    public void connect() {
        System.out.println("Conectare la GPS: coordonate (" + latitudine + ", " + longitudine + ")");
    }

    @Override
    public String getId() {
        return id;
    }


}
