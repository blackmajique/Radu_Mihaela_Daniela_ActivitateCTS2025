package clase;

public class Filiala implements Structura{
    private String numeFiliala;

    public Filiala(String numeFiliala) {
        this.numeFiliala = numeFiliala;
    }

    @Override
    public void adaugaNod(Structura structura) throws Exception{
        throw new Exception("Nu este implementata");
    }

    @Override
    public void stergeNod(Structura structura) throws Exception{
        throw new Exception("Nu este implementata");
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Nume filiala: " + numeFiliala);
    }

    @Override
    public Structura getNod(int index) throws Exception{
        throw new Exception("Nu este implementata");
    }
}
