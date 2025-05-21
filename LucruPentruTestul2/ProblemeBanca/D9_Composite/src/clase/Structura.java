package clase;

public interface Structura {
    public void adaugaNod(Structura structura) throws Exception;
    public void stergeNod(Structura structura) throws Exception;
    public void afiseazaDetalii();
    public Structura getNod(int index) throws Exception;
}
