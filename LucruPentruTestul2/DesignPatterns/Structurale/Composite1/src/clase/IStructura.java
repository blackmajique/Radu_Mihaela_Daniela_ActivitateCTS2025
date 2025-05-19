package clase;

public interface IStructura {
    public void afisareDescriere();
    public void adaugareStructura(IStructura structura) throws Exception;
    public void stergeStructura(IStructura structura) throws Exception;
    IStructura getStructura(int index) throws Exception;
}
