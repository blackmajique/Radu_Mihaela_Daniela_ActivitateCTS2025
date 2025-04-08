package Clase;

public class PacientBuilder implements IBuild{
    private final Pacient pacient;

    public PacientBuilder() {
        pacient = new Pacient();
    }

//    private boolean patRabatabil;
//    private boolean micDejun;
//    private boolean papuciDeCamera;
//    private boolean halatPentruInterior;

   public PacientBuilder setPatRabatabil(boolean patRabatabil) {
        pacient.setPatRabatabil(patRabatabil);
        return this;
   }

    public PacientBuilder setMicDejun(boolean micDejun) {
        pacient.setMicDejun(micDejun);
        return this;
    }

    public PacientBuilder setPapuciDeCamera(boolean papuciDeCamera) {
        pacient.setPapuciDeCamera(papuciDeCamera);
        return this;
    }

    public PacientBuilder setHalatPentruInterior(boolean halatPentruInterior) {
        pacient.setHalatPentruInterior(halatPentruInterior);
        return this;
    }


    @Override
    public Pacient build() {
        return pacient;
    }
}
