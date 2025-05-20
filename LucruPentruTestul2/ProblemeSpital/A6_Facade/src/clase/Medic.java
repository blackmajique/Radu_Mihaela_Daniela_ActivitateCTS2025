package clase;

public class Medic {
    private String numeSpecializare;
    private String numeSpital;

    public Medic(String numeSpecializare, String numeSpital) {
        this.numeSpecializare = numeSpecializare;
        this.numeSpital = numeSpital;
    }

    public boolean confirmareMedic(Pacient pacient) {
        if(pacient.verificareGravitatePacient()){
            return true;
        }
        return false;
    }
}
