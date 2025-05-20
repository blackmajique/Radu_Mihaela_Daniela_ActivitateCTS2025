package clase;

public interface Structura {
    void adaugaItem(Structura structura1, Structura structura2) throws Exception;
    void stergeItem(Structura structura1, Structura structura2) throws Exception;
    void printareStructura();
    Structura getStructura(int index) throws Exception;
}
