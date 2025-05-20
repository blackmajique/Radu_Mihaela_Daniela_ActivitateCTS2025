package clase;

public interface Structura {
    void adaugaStructura(Structura s) throws Exception;
    void stergeStructura(Structura s) throws Exception;
    void printareStructura();
    Structura getStructura(int index) throws Exception;
}
