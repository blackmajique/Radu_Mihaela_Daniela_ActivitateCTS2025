package Main;

import Clase.GPSConnection;
import Clase.RegistryConnection;

public class Main {
    public static void main(String[] args) throws Exception {
        RegistryConnection registryConnection = RegistryConnection.getInstance();
        registryConnection.afisareConectiune();

        registryConnection.inregistreazaConectiune(new GPSConnection("1",22.22, 321.22));
        registryConnection.inregistreazaConectiune(new GPSConnection("2",22.22, 321.22));
        registryConnection.afisareConectiune();

    }
}