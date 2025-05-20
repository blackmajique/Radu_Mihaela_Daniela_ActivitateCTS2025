package clase;

public class SpitalFacade {
    public void verificareStarePacientSiDisponibilitateSpital(Pacient pacient) {
        Medic medic = new Medic("Oncologie", "Militar");
        Salon salon = new Salon(4, 4, 6);
        if(pacient.verificareGravitatePacient()){
            System.out.println("Starea pacientului este grava si trebuie verificat de medic");
            if(medic.confirmareMedic(pacient)){
                System.out.println("Starea pacientului a fost verificata de medic, trebuie internat");
                if(salon.verificareDisponibilitatePat()){
                    System.out.println("Pacientul va fi internat, avem paturi");
                }
                else{
                    System.out.println("Nu exista paturi pentru pacient");
                }
            }
            else{
                System.out.println("Medicul a concluzionat ca nu e necesara internarea");
            }
        }
        else{
            System.out.println("Pacientul nu e intr-o stare grava");
        }
    }
}
