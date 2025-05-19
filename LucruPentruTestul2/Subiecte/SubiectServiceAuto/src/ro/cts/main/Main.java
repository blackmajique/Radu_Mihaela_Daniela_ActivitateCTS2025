package ro.cts.main;

import ro.cts.clase.IMasina;
import ro.cts.clase.Masina;
import ro.cts.clase.StickerFactory;

public class Main {
    public static void main(String[] args) {
        StickerFactory factory = new StickerFactory();

        IMasina m1 = new Masina("BMW", 2020);
        IMasina m2 = new Masina("Audi", 2019);
        IMasina m3 = new Masina("BMW", 2020); // va refolosi
        IMasina m4 = new Masina("Dacia", 2022);

        factory.getSticker(m1).afiseaza();
        factory.getSticker(m2).afiseaza();
        factory.getSticker(m3).afiseaza();
        factory.getSticker(m4).afiseaza();
    }
}