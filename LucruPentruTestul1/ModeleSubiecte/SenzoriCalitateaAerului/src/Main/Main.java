package Main;
//    3p. Un senzor de calitate a aerului inteligent va trimite în fiecare dimineață un raport privind calitatea
//    aerului estimată pentru ziua respectivă. Clasa aferentă raportului implementează interfața
//    AbstractAirQualityReport. Tipul de raport este influențat de valoarea nivelului de particule fin (PM 2.5)
//    estimată de modulul de machine learning extern senzorului (va proveni din exterior) astfel:
//    dacă valoarea este cuprinsă în intervalul 0-30 se va genera un raport de aer curat; dacă valoarea este
//    cuprinsă în intervalul 31-70 se va genera un raport de avertizare; dacă valoarea depășește 71 se va
//    genera un raport de risc asupra sănătății. Utilizați un design pattern ce permite crearea raportului
//    corespunzător valorii PM 2.5 primită de senzor.
//
//    1.5p. Testați implementarea prin crearea a 3 rapoarte diferite pentru trei valori diferite ale PM 2.5
//    primite de senzor (câte o valoare pentru fiecare interval).
//
//    3p. Un senzor de calitate a aerului oferă o plajă largă de masurători în funcție de model precum: nivel
//    PM 2.5, nivel PM10, nivel VOC, nivel CO2, nivel CO, temperatură, umiditate, etc. Clasa aferentă unui
//    senzor este derivată din interfața AbstractAirQualitySensor. Aplicația permite crearea de senzori
//    ce dispun de toate capabilitățile sau doar o parte din ele. Un senzor odată creat nu mai poate fi modificat. În plus, se dorește ca procedeul de creare a unui senzor să poată utiliza o singură linie de
//    cod. Implementați un design pattern ce rezolvă situația descrisă.
//
//    1.5p. Testați în main implementarea prin crearea a minim 3 senzori ce conțin diverse combinații de
//    capabilități. Demonstrați faptul că fiecare dintre cei 3 senzori poate fi creat într-o singură linie de cod
//    și că instrucțiunile de creare sunt independente (faptul că un senzor are o anumită capabilitate nu va
//    influența capabilitățile senzorilor ce vor fi creați în viitor).

import Builder.AbstractAirQualitySensor;
import Builder.IBuild;
import Builder.Senzor;
import Builder.SenzorBuilder;
import SimpleFactory.Clase.AbstractAirQualityReport;
import SimpleFactory.SimpleFactory.SimpleFactory;

public class Main {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        AbstractAirQualityReport raport1 = simpleFactory.createAirQualityReport(56);
        raport1.afisareRaport();

        AbstractAirQualityReport raport2 = simpleFactory.createAirQualityReport(20);
        raport2.afisareRaport();

        AbstractAirQualityReport raport3 = simpleFactory.createAirQualityReport(80);
        raport3.afisareRaport();

       AbstractAirQualitySensor senzor = new SenzorBuilder().setNivelCO2(true).setNivelCO(true).build(24, 20);
       AbstractAirQualitySensor senzor1 = new SenzorBuilder().setNivelPM2_5(true).setNivelPM10(true).build(24, 69);

        senzor1.afiseazaDetalii();
        senzor.afiseazaDetalii();
    }
}