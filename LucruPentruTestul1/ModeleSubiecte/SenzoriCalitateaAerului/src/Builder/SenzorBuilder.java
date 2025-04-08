package Builder;

public class SenzorBuilder implements IBuild {

    private boolean areNivelPM2_5 = false;
    private boolean areNivelPM10 = false;
    private boolean areNivelVOC = false;
    private boolean areNivelCO2 = false;
    private boolean areNivelCO = false;

    public SenzorBuilder setNivelPM2_5(boolean val) {
        this.areNivelPM2_5 = val;
        return this;
    }

    public SenzorBuilder setNivelPM10(boolean val) {
        this.areNivelPM10 = val;
        return this;
    }

    public SenzorBuilder setNivelVOC(boolean val) {
        this.areNivelVOC = val;
        return this;
    }

    public SenzorBuilder setNivelCO2(boolean val) {
        this.areNivelCO2 = val;
        return this;
    }

    public SenzorBuilder setNivelCO(boolean val) {
        this.areNivelCO = val;
        return this;
    }

    @Override
    public AbstractAirQualitySensor build(float temperatura, float umiditate) {
        return new Senzor(areNivelPM2_5, areNivelPM10, areNivelVOC, areNivelCO2, areNivelCO, temperatura, umiditate);
    }
}
