package cts.clase;

public interface IClip {
    public void afiseazaDetalii();

    public void adaugaClip(IClip clip) throws Exception;
    public void stergeClip(IClip clip) throws Exception;
    public IClip getClip(int cheie) throws Exception;
}
