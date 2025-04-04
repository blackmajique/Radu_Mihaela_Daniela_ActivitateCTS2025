package Main;

import java.util.Arrays;
import java.util.List;

// sa se creeze instanta timpuriu, crearea instantei s-ar putea sa creeze erori
// static bloc la lucrare
// thread safe - aplicatia va rula pe mai multe fire de executie
// registry - mai multe file de mapare
// cu fisiere nu
// la builder putem implementa orie versiune vrem (da se gandeste profu)
// la prototype - specifica daca tre shallow copy sau deep copy
// de obicei specifica


public class Main {
    public static void main(String[] args) {

        // eager
        AgentieEagerInitialization a1 = AgentieEagerInitialization.getInstance();
        System.out.println(a1);

        // lazy
        AgentieLazyInitialization a2 =  AgentieLazyInitialization.getInstance("unNume", 1000, 1000, "001", Arrays.asList("Rezervare", "Consultare"));
        System.out.println(a2);

        // thread-safe
        AgentieThreadSafe a3 = AgentieThreadSafe.getInstance("unNume", 1000, 1000, "001", Arrays.asList("Rezervare"));
        System.out.println(a3);

        Runnable task = () -> {
            List<String> servicii = Arrays.asList("Rezervari", "Ghidaj", "Cazare");

            AgentieThreadSafe agentie = AgentieThreadSafe.getInstance(
                    "TravelNow", 10000f, 30, "123ABC", servicii
            );

            System.out.println(Thread.currentThread().getName() + " → " + agentie);
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");

        t1.start();
        t2.start();
        t3.start();

        // enum
        AgentieEnum agentie = AgentieEnum.instance;

        System.out.println("Nume: " + agentie.getNumeAgentie());
        System.out.println("Capital: " + agentie.getCapital());
        System.out.println("Angajați: " + agentie.getNumarAngajati());
        System.out.println("Cod fiscal: " + agentie.getCodFiscal());
        System.out.println("Servicii: " + agentie.getListaServicii());

        agentie.setNumeAgentie("VacanteDeTop");
        agentie.setCapital(9999);
        agentie.setListaServicii(Arrays.asList("Croaziere", "City Break", "Asigurari"));

        System.out.println("\n--- După modificare ---");
        System.out.println("Nume: " + agentie.getNumeAgentie());
        System.out.println("Capital: " + agentie.getCapital());
        System.out.println("Servicii: " + agentie.getListaServicii());

        // static block
        AgentieStaticBlock agentieStaticBlock = AgentieStaticBlock.getInstance();
        System.out.println(agentieStaticBlock);
    }
}
