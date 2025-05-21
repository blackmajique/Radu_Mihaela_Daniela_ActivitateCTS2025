package clase;

public interface Subject {
    void adaugaObservabile(Observer observer);
    void stergeObservabile(Observer observer);
    void trimiteMesaj(String mesaj);
}
