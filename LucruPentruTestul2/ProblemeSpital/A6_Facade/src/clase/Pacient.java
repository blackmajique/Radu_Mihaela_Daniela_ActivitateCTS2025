package clase;

public class Pacient {
    private String nume;
    private int gravitateInTermeniNumerali;

    public Pacient(String nume, int gravitateInTermeniNumerali) {
        this.nume = nume;
        this.gravitateInTermeniNumerali = gravitateInTermeniNumerali;
    }

    public boolean verificareGravitatePacient() {
        if(gravitateInTermeniNumerali >= 6){
            return true;
        }
        return false;
    }
}
