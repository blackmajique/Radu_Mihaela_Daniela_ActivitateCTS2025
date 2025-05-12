package ro.cts.clase;

public interface Subject {
    void adaugaObservabil(Observer observabil);
    void stergeObservabil(Observer observabil);
    void trimitereMesaj(String mesaj);
}
