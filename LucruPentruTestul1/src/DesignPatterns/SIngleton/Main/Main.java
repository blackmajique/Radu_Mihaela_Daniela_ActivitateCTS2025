package DesignPatterns.SIngleton.Main;

import DesignPatterns.SIngleton.AgentieEagerInitialization;
import DesignPatterns.SIngleton.AgentieLazyInitialization;
import DesignPatterns.SIngleton.AgentieThreadSafe;

import java.util.Arrays;
import java.util.List;

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


    }
}
