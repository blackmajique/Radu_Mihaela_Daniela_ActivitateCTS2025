package Main;

import Clase.ContBancar;
import Clase.ContBancarBuilderV1;
import Clase.ContBancarBuilderV2;

public class Main {
    public static void main(String[] args) {
        ContBancar contBancar = new ContBancarBuilderV1().setDetinator("Marian").setContSalariu(true).setCardAtasat(true).setInternetBanking(true).build();
        System.out.println(contBancar);

        ContBancar contBancar1 = new ContBancarBuilderV2().build();
        System.out.println(contBancar1);
        ContBancar contBancar2 = new ContBancarBuilderV2().setContSalariu(true).setCardAtasat(true).setInternetBanking(true).build();
        System.out.println(contBancar2);
    }
}
