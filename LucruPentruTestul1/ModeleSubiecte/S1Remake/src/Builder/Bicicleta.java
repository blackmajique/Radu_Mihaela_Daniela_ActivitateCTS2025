package Builder;

//    4p. Pentru un magazin care produce și vinde Biciclete se dorește implementarea unei aplicații care să ajute
//    la gestionarea fabricării de biciclete. Astfel în cadrul aplicației inginerii au
//    posibilitatea creării obiectelor pentru seturi de biciclete care au mai multe
//    caracteristici, dintre care unele sunt opționale: diametruRoti, tipFrana,
//    cascaProtectie, ochelari, etc. Orice set creat nu mai poate fi modificat urmand
//    sa fie vandut asa cum a fost creat. Să se implementeze modulul care îi va ajuta
//    pe gestionari în procesul de creare al obiectelor de tip Bicicleta. Clasa
//    Bicicleta trebuie sa implementeze interfata IBicicleta.

//    1p. Să se testeze soluția prin crearea a cel puțin patru obiecte
//    prin intermediul modulului implementat

public class Bicicleta {
    private float diametruRoti;
    private String tipFrana;
    private boolean areCascaDeProtectie;
    private boolean areOchelari;

    public Bicicleta(float diametruRoti, String tipFrana, boolean areCascaDeProtectie, boolean areOchelari) {
        this.diametruRoti = diametruRoti;
        this.tipFrana = tipFrana;
        this.areCascaDeProtectie = areCascaDeProtectie;
        this.areOchelari = areOchelari;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "diametruRoti=" + diametruRoti +
                ", tipFrana='" + tipFrana + '\'' +
                ", areCascaDeProtectie=" + areCascaDeProtectie +
                ", areOchelari=" + areOchelari +
                '}';
    }
}
