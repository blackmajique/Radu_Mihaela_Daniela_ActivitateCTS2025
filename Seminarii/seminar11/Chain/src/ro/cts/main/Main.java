package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        MijlocTransport troleibuz = new Troleibuz();
        MijlocTransport autobuz = new Autobuz();
        MijlocTransport tramvai = new Tramvai();
        MijlocTransport metrou = new Metrou();

        troleibuz.setMijlocTransport(autobuz);
        autobuz.setMijlocTransport(tramvai);
        tramvai.setMijlocTransport(metrou);

        troleibuz.notificaCalator(11);
    }
}