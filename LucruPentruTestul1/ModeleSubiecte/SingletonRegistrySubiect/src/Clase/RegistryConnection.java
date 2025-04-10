package Clase;

import java.util.HashMap;
import java.util.Map;

public class RegistryConnection {
    private static RegistryConnection instance = null;
    private static Map<String, GPSConnection> registryConnections = new HashMap<String, GPSConnection>();
    private String id;

    public RegistryConnection() {
    }

    public static RegistryConnection getInstance() {
        if (instance == null) {
            instance = new RegistryConnection();
        }
        return instance;
    }

    public void inregistreazaConectiune(GPSConnection gpsConnection) throws Exception {
        if(!registryConnections.containsKey(gpsConnection.getId())) {
            registryConnections.put(gpsConnection.getId(), gpsConnection);
        } else {
            throw new Exception("Already registrated");
        }
    }

    public void afisareConectiune(){
        if(registryConnections.isEmpty())
        {
            System.out.println("No registrated");
        }
        else{
            System.out.println("Registrated:");
            for(GPSConnection gpsConnection : registryConnections.values()) {
                gpsConnection.connect();
            }
        }
    }
}
