package Builder;

public class Senzor implements AbstractAirQualitySensor {
    private boolean areNivelPM2_5;
    private boolean areNivelPM10;
    private boolean areNivelVOC;
    private boolean areNivelCO2;
    private boolean areNivelCO;
    private float temperatura;
    private float umiditate;

    public Senzor() {
        this.areNivelPM2_5 = false;
        this.areNivelPM10 = false;
        this.areNivelVOC = false;
        this.areNivelCO2 = false;
        this.areNivelCO = false;
        this.temperatura = 0;
        this.umiditate = 0;
    }

    public Senzor(boolean areNivelPM2_5, boolean areNivelPM10, boolean areNivelVOC, boolean areNivelCO2, boolean areNivelCO, float temperatura, float umiditate) {
        this.areNivelPM2_5 = areNivelPM2_5;
        this.areNivelPM10 = areNivelPM10;
        this.areNivelVOC = areNivelVOC;
        this.areNivelCO2 = areNivelCO2;
        this.areNivelCO = areNivelCO;
        this.temperatura = temperatura;
        this.umiditate = umiditate;
    }

    public boolean isAreNivelPM2_5() {
        return areNivelPM2_5;
    }

    public void setAreNivelPM2_5(boolean areNivelPM2_5) {
        this.areNivelPM2_5 = areNivelPM2_5;
    }

    public boolean isAreNivelPM10() {
        return areNivelPM10;
    }

    public void setAreNivelPM10(boolean areNivelPM10) {
        this.areNivelPM10 = areNivelPM10;
    }

    public boolean isAreNivelVOC() {
        return areNivelVOC;
    }

    public void setAreNivelVOC(boolean areNivelVOC) {
        this.areNivelVOC = areNivelVOC;
    }

    public boolean isAreNivelCO2() {
        return areNivelCO2;
    }

    public void setAreNivelCO2(boolean areNivelCO2) {
        this.areNivelCO2 = areNivelCO2;
    }

    public boolean isAreNivelCO() {
        return areNivelCO;
    }

    public void setAreNivelCO(boolean areNivelCO) {
        this.areNivelCO = areNivelCO;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getUmiditate() {
        return umiditate;
    }

    public void setUmiditate(float umiditate) {
        this.umiditate = umiditate;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Senzor detalii: " + "\n" + " - Daca are nivel PM 2.5: " + areNivelPM2_5 +
                "\n" + " - Daca are nivel PM 10: " + areNivelPM10 +
                "\n" + "- Daca are nivel VOC: " + areNivelVOC +
                "\n" + "- Daca are nivel CO2: " + areNivelCO2 +
                "\n" + "- Daca are nivel CO: " + areNivelCO +
                "\n" + " Temperatura: " + temperatura +
                "\n" + " Umiditate: " + umiditate);
    }
}
