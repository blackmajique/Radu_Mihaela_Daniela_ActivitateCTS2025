package Facade.Clase;

public class Receptionist {
    public String poateLuaLocLaMasa(Masa masa) {
        Ospatar ospatar = new Ospatar();
        Picolo picolo = new Picolo();
        if(masa.isEsteLibera()) {
            if(picolo.esteDebarasata(masa)) {
                System.out.println("Masa este libera");
                if(ospatar.esteAranjata(masa)) {
                    return "Masa este aranjata, puteti lua loc la masa cu nr. " + masa.getNumarMasa();
                }
                else {
                    return "Masa este libera dar nu este aranjata.";
                }
            }
            else {
                return "Asteptati putin, tocmai se ridica cineva.";
            }
        }
        else {
            return "Masa nu este disponibila.";
        }
    }
}
