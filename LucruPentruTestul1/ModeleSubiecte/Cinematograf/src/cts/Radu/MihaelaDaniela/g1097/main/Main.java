package cts.Radu.MihaelaDaniela.g1097.main;

import cts.Radu.MihaelaDaniela.g1097.Prototype.Ticket;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Simulăm un prototip de bilet costisitor (primul bilet)
        Ticket ticketPrototip = new Ticket(
                "Dune: Part Two",
                "Denis Villeneuve",
                Arrays.asList("Timothée Chalamet", "Zendaya"),
                "Warner Bros.",
                "Continuarea epopeei SF.",
                "url://img_reclama.jpg",
                null,
                0
        );

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți numărul de bilete: ");
        int n = Integer.parseInt(scanner.nextLine());

        List<Ticket> listaBilete = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Introduceți [data yyyy-MM-dd] și [locuri rezervate] pentru biletul #" + (i + 1) + ": ");
            String[] input = scanner.nextLine().split(" ");

            if (input.length != 2) {
                System.out.println("⚠️ Format invalid. Încearcă din nou.");
                i--;
                continue;
            }

            LocalDate data = LocalDate.parse(input[0]);
            int locuri = Integer.parseInt(input[1]);

            // clonăm biletul
            Ticket biletNou = ticketPrototip.clone(data, locuri);
            listaBilete.add(biletNou);
        }

        // Afișare bilete
        System.out.println("\n🎫 Bilete generate:");
        for (Ticket t : listaBilete) {
            t.afisareDetaliiRezervareBilet();
        }
    }
}
