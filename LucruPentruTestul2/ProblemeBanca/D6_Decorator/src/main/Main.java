package main;

//    6. Clienții care dețin cont bancar cu card atașat, pot realiza plăți
//    online cu acel card, sau plăți la normale cu cardul. Banca decide să adauge o
//    nouă funcționalitate cardurilor și anume plata ContactLess. Astfel se cere
//    echipei IT să implementeze un modul care să adauge cardurilor această nouă funcționalitate.

import clase.CardBancar;
import clase.PlataContactless;
import clase.PlataFizic;
import clase.PlataOnline;

public class Main {
    public static void main(String[] args) {
        CardBancar plataFizic = new PlataFizic(1243.3f);
        plataFizic.efectueazaPlataCard();
        CardBancar plataCard = new PlataOnline("Mega");
        plataCard.efectueazaPlataCard();
        CardBancar plataContactless = new PlataContactless(plataCard);
        plataContactless.efectueazaPlataCard();
    }
}