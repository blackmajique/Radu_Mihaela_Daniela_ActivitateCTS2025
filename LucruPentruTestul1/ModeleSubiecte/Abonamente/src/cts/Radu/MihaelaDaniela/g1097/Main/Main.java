package cts.Radu.MihaelaDaniela.g1097.Main;

//    5p. O companie care oferă servicii de telefonie mobilă pune la dispoziția clienților 3 tipuri de
//    abonamente: MobilityX (cuprinde doar servicii de voce), MobilityY (cuprinde doar servicii de
//    date), MobilityZ (cuprinde servicii de voce, de date și tv online). Fiecare tip de abonament pune
//    la dispoziție o modalitate prin care se poate afla care va fi costul total cu acest abonament, în
//    funcție de numărul de luni contractuale. Să se implementeze componenta aplicației care să poată
//    crea abonamente la cerere, în funcție de tipul abonamentului cerut. Implementarea se va realiza
//    plecând de la interfața Subscription atașată acestui enunț.
//            3p. Să se testeze soluția în metoda main() prin generarea de abonamente, astfel: se tastează numărul
//    de abonamente ce urmează a fi generate și apoi se citesc de la tastatură detaliile care trebuie
//    completate (citirea se realizează într-o buclă până la crearea numărului solicitat de abonamente).
//            9p. Compania își extinde activitatea prin crearea unei divizii separate care vinde clienților următoarele
//    extra opțiuni: internet în roaming, minute în roaming, internet 5G. Aceste opțiuni se vând pe lângă
//    beneficiile existente într-un abonament existent (la un abonament se pot atașa 1, 2 sau toate
//    cele 3 extra opțiuni). Această nouă divizie acționează independent de celelalte structuri ale
//    companiei iar accesul la abonamente se face pe baza unui API care furnizează abonamentele
//    clasice, neexistând posibilitatea de modifica codul sursă existent pentru generarea
//    abonamentelor cu extra opțiuni. Componenta implementată trebuie să expună o modalitate prin
//    care se poate calcula costul total al abonamentului (abonament de bază + costuri extra opțiuni)
//    S2 – Abonamente
//    pentru un anumit număr de luni. Implementați o modalitate prin care să se genereze
//    abonamente cu extra opțiuni, conform descrierii anterioare.
//            3p. Pattern-ul este testat în main() prin definirea și utilizarea a cel puțin un obiect din familia
//    abonamentelor cu extra opțiuni. Se va exemplifica și calculul costurilor totale pentru o perioadă
//    de timp.



//5p. O companie care oferă servicii de telefonie mobilă dorește să implementeze un sistem flexibil pentru configurarea abonamentelor personalizate în funcție de nevoile clienților.
//        Clienții pot alege un abonament de bază (ex: voce, date, voce+date+TV), iar ulterior își pot adăuga opțional una, două sau toate dintre următoarele extra opțiuni:
//        📶 Internet în roaming
//        ☎️ Minute în roaming
//        ⚡ Internet 5G
//        Fiecare opțiune extra are un cost suplimentar calculat în funcție de durata contractului (pe lună).
//        Se dorește ca sistemul de configurare a abonamentului să fie clar, ușor de extins și să permită construirea pas cu pas a unei instanțe de abonament personalizat, specificând:
//        abonamentul de bază
//        opțiunile dorite
//        După construirea obiectului, aplicația trebuie să permită:
//        obținerea descrierii complete a abonamentului
//        calcularea costului total în funcție de numărul de luni
//        Se va implementa un Builder Pattern care permite compunerea unui abonament complet cu ajutorul unei secvențe de metode (ex: with5G(), withRoamingInternet() etc.), urmată de build().

import cts.Radu.MihaelaDaniela.g1097.Builder.ExtraOptiuni;
import cts.Radu.MihaelaDaniela.g1097.Builder.ExtraOptiuniBuilder;
import cts.Radu.MihaelaDaniela.g1097.Factory.Clase.ISubscription;
import cts.Radu.MihaelaDaniela.g1097.Factory.Clase.TipMobility;
import cts.Radu.MihaelaDaniela.g1097.Factory.SimpleFactory.SubscriptionSimpleFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SubscriptionSimpleFactory subscriptionSimpleFactory = new SubscriptionSimpleFactory();

//        System.out.println("Introdu nr de abonamente: ");
//        int nrAbonamente = Integer.parseInt(scanner.nextLine());
//
//        List<ISubscription> abonamente = new ArrayList<>();
//
//        for(int i = 0; i < nrAbonamente; i++) {
//            System.out.println("Abonamentul cu nr. " + +i+1);
//
//            System.out.println("Introdu tipul abonamentului (X, Y, Z): ");
//            TipMobility tipMobility = TipMobility.valueOf(scanner.nextLine());
//
//            System.out.println("Introduceti nr de luni: ");
//            int luni = Integer.parseInt(scanner.nextLine());
//
//            ISubscription abonament = subscriptionSimpleFactory.createSubscription(tipMobility);
//            double costTotal = abonament.costTotalAlSubscriptiei(luni);
//            abonament.afisareDelatiiSubscriptie();
//            System.out.println("Constul total al abonamentului: " + costTotal);
//
//            abonamente.add(abonament);
//        }

        ISubscription abonament = subscriptionSimpleFactory.createSubscription(TipMobility.Y);
        double costTotal = abonament.costTotalAlSubscriptiei(2);
        abonament.afisareDelatiiSubscriptie();

        System.out.println("Constul total al abonamentului: " + costTotal);

        ExtraOptiuni extraOptiuni = new ExtraOptiuniBuilder(abonament).areRoamingInternet(true).areRoamingMinute(true).are5G(true).build();
        extraOptiuni.afisareDelatiiSubscriptie();
    }
}