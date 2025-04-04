package Main;

import Clase.ContBancar;
import Clase.ContBancarBuilderV1;

public class Main {
    public static void main(String[] args) {
        ContBancar contBancar = new ContBancarBuilderV1().setDetinator("Marian").setContSalariu(true).setCardAtasat(true).setInternetBanking(true).build();
        System.out.println(contBancar);
    }
}
