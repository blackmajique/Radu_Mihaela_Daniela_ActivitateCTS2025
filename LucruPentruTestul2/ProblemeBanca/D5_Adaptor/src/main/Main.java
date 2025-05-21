package main;

//    5. Banca achiziționează un framework pentru oferirea de credite
//            de leasing, însă clasele din acest framework nu
//    sunt asemănătoare cu clasele utilizate de aplicația
//    existentă. Se cere echipei IT să creeze un modul
//    care să permită utilizarea claselor din framework-ul
//            nou achiziționat, împreună cu clasele deja
//    existente în aplicație.

import clase.CreditAdapter;
import clase.CreditLeasing;
import clase.CreditSimplu;
import clase.ICredit;

public class Main {
    public static void main(String[] args) {
        ICredit creditSimplu = new CreditSimplu();
        creditSimplu.printareCredit("Maria", 13432.43f);

        ICredit creditLeasing = new CreditLeasing();
        creditLeasing.printareCredit("Maria", 13432.43f);

        ICredit credit = new CreditAdapter(creditLeasing);
        credit.printareCredit("Maria", 13432.43f);

    }
}