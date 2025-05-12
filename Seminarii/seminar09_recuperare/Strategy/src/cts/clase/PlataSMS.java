package cts.clase;

public class PlataSMS implements IMetodaPlata {

    @Override
    public void plateste(float pretBilet) {
        System.out.println("Ai platit cu cardul o calatorie prin SMS");
    }
}
