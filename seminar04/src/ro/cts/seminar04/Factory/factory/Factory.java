package ro.cts.seminar04.Factory.factory;

import ro.cts.seminar04.Factory.clase.Supa;
import ro.cts.seminar04.Factory.clase.SupaCiuperci;
import ro.cts.seminar04.Factory.clase.SupaLegume;
import ro.cts.seminar04.Factory.clase.SupaVita;

public class Factory {

    private int gramaj;
    private double pretPerSutaDeGrame;

    public Factory(int gramaj, double pretPerSutaDeGrame) {
        this.gramaj = gramaj;
        this.pretPerSutaDeGrame = pretPerSutaDeGrame;
    }

    public Supa getSupa(TipuriSupe tipuriSupe, String ingrediente, double extraSupa) {
        switch (tipuriSupe) {
            case LEGUME:
                SupaLegume supaLegume = new SupaLegume(gramaj, pretPerSutaDeGrame, ingrediente, extraSupa);
                return supaLegume;
            case CIUPERCI:
                SupaCiuperci supaCiuperci = new SupaCiuperci(gramaj, pretPerSutaDeGrame, ingrediente, extraSupa);
                return supaCiuperci;
            case VITA:
                SupaVita supaVita = new SupaVita(gramaj, pretPerSutaDeGrame, ingrediente, extraSupa);
                return supaVita;
                default:
                    return null;
        }
    }

}
