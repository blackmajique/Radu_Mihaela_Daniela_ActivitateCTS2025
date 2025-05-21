package main;

//    10. Pentru fiecare cont trebuie să se rețină informații cu
//    privire la deținătorul său: nume, adresa, număr de telefon,
//    adresă de mail, etc, precum și informațiile despre bancă:
//    nume, sucursală, capital, etc. Pe lângă aceste informații
//    un cont deține și informații precum număr cont, sumă etc.
//            Astfel, dacă o persoană are mai multe conturi, la fiecare
//    cont informațiile despre deținător sunt aceleași și se repetă,
//    ocupând foarte multă memorie. Să se implementeze modulul de
//    memorare al conturilor astfel încât să nu se ocupe memorie foarte multă.

import clase.*;

public class Main {
    public static void main(String[] args) {
        ContFlyweight factory = new ContFlyweight();

        DetinatorCont detinator = new DetinatorCont("Maria", "0720123123", "maria@gmail.com");
        DetaliiBanca banca = new DetaliiBanca("BCR", "Bucuresti");

        try{
            IDetaliiCont cont1 = factory.getCont(1001, 5000);
            IDetaliiCont cont2 = factory.getCont(1002, 8000f);
            IDetaliiCont cont3 = factory.getCont(1001, 9999f);

            cont1.afisareDetalii(detinator, banca);
            cont2.afisareDetalii(detinator, banca);
            cont3.afisareDetalii(detinator, banca);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
