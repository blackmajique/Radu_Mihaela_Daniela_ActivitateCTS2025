package cts.clase;

import java.sql.SQLOutput;

public class CardBancar implements IMetodaPlata {
    private float soldBancar;

    public CardBancar(float soldBancar) {
        this.soldBancar = soldBancar;
    }

    @Override
    public void plateste(float pretBilet) {
        if(soldBancar >= pretBilet) {
            System.out.println("Ai platit cu cardul o calatorie");
            soldBancar -= pretBilet;
        }
        else {
            System.out.println("Solduri insuficiente");
        }
    }
}
