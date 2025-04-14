package ro.cts.seminar05.BuilderV2.Clase;

public class PacientBuilder implements AbstractBuilder {
    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean arePapuciDeCamera;
    private boolean areHalatDeInterior;
    private String numeInsotitor;

   public PacientBuilder(){
       this.arePatRabatabil = false;
       this.areMicDejunInclus = false;
       this.arePapuciDeCamera = false;
       this.areHalatDeInterior = false;
       this.numeInsotitor = "Alt pacient";
   }

    public PacientBuilder setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public PacientBuilder setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
        return this;
    }

    public PacientBuilder setAreMicDejunInclus(boolean areMicDejunInclus) {
        this.areMicDejunInclus = areMicDejunInclus;
        return this;
    }

    public PacientBuilder setArePapuciDeCamera(boolean arePapuciDeCamera) {
        this.arePapuciDeCamera = arePapuciDeCamera;
        return this;
    }

    public PacientBuilder setAreHalatDeInterior(boolean areHalatDeInterior) {
        this.areHalatDeInterior = areHalatDeInterior;
        return this;
    }

    public PacientBuilder setNumeInsotitor(String numeInsotitor) {
        this.numeInsotitor = numeInsotitor;
        return this;
    }

    @Override
    public Pacient build(String nume) {
        return new Pacient(nume, this.arePatRabatabil, this.areMicDejunInclus, this.arePapuciDeCamera, this.areHalatDeInterior, this.numeInsotitor);
    }
}
