package SimpleFactory.SimpleFactory;

import SimpleFactory.Clase.AbstractAirQualityReport;
import SimpleFactory.Clase.RaportDeAerCurat;
import SimpleFactory.Clase.RaportDeAvertizare;
import SimpleFactory.Clase.RaportDeRiscSanatate;

public class SimpleFactory {
    public AbstractAirQualityReport createAirQualityReport(int nivelParticuleFine) {
        if(nivelParticuleFine >= 0 && nivelParticuleFine <= 30) {
            return  new RaportDeAerCurat("Raport aer curat", nivelParticuleFine);
        }
        else if(nivelParticuleFine >= 31 && nivelParticuleFine <= 70) {
            return new RaportDeAvertizare("Raport avertizare", nivelParticuleFine);
        } else if (nivelParticuleFine >= 71) {
            return new RaportDeRiscSanatate("Raport risc sanatate", nivelParticuleFine);
        }
        return null;
    }
}
