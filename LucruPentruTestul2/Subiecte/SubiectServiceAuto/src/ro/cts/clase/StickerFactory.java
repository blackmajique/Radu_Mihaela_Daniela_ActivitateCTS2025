package ro.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class StickerFactory {
    private final Map<String, Sticker> cache = new HashMap<>();

    public Sticker getSticker(IMasina masina) {
        masina.afiseazaDetalii();
        String key = masina.getModel() + "_" + masina.getAnFabricatie();
        Sticker sticker = cache.get(key);

        if (sticker == null) {
            System.out.println("Creez Sticker nou pentru: " + key);
            sticker = new Sticker(masina.getModel(), masina.getAnFabricatie(), "200x300");
            cache.put(key, sticker);
        } else {
            System.out.println("Refolosesc Sticker existent pentru: " + key);
        }

        return sticker;
    }
}
