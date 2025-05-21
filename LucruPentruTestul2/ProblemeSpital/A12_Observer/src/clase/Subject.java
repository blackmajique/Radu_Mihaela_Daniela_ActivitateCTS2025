package clase;

public interface Subject {
    void adaugaObservabil(Observer observer);
    void stergeObservabil(Observer observer);
    void trimiteMesaj(String mesaj);
}
