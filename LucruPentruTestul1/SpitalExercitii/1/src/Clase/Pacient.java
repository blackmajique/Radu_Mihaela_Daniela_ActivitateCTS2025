package Clase;

public class Pacient {
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuciDeCamera;
    private boolean halatPentruInterior;

    public Pacient() {
    }

    public Pacient(boolean patRabatabil, boolean micDejun, boolean papuciDeCamera, boolean halatPentruInterior) {
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.papuciDeCamera = papuciDeCamera;
        this.halatPentruInterior = halatPentruInterior;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "patRabatabil=" + patRabatabil +
                ", micDejun=" + micDejun +
                ", papuciDeCamera=" + papuciDeCamera +
                ", halatPentruInterior=" + halatPentruInterior +
                '}';
    }

    public boolean isPatRabatabil() {
        return patRabatabil;
    }

    public void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    public boolean isMicDejun() {
        return micDejun;
    }

    public void setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
    }

    public boolean isPapuciDeCamera() {
        return papuciDeCamera;
    }

    public void setPapuciDeCamera(boolean papuciDeCamera) {
        this.papuciDeCamera = papuciDeCamera;
    }

    public boolean isHalatPentruInterior() {
        return halatPentruInterior;
    }

    public void setHalatPentruInterior(boolean halatPentruInterior) {
        this.halatPentruInterior = halatPentruInterior;
    }
}
