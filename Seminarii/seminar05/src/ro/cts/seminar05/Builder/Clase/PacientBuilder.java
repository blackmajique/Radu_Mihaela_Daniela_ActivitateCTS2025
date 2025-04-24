package ro.cts.seminar05.Builder.Clase;

public class PacientBuilder implements AbstractBuilder {
    private final Pacient pacient;

    public PacientBuilder(String nume){
        this.pacient = new Pacient(nume, false, false, false, false, "Un alt pacient");
    }

    public PacientBuilder setArePatRabatabil(boolean arePatRabatabil){
        this.pacient.setArePatRabatabil(arePatRabatabil);
        return this;
    }

    public PacientBuilder setAreMicDejun(boolean areMicDejun){
        this.pacient.setArePatRabatabil(areMicDejun);
        return this;
    }

    public PacientBuilder setArePapuciDeCamera(boolean arePapuciDeCamera){
        this.pacient.setArePatRabatabil(arePapuciDeCamera);
        return this;
    }

    public PacientBuilder setAreHalatDeInterior(boolean areHalatDeInterior){
        this.pacient.setAreHalatDeInterior(areHalatDeInterior);
        return this;
    }

    public PacientBuilder setNumeInsotitor(String numeInsotitor){
        this.pacient.setNumeInsotitor(numeInsotitor);
        return this;
    }

    @Override
    public Pacient getPacient(){
        return this.pacient;
    }
}
