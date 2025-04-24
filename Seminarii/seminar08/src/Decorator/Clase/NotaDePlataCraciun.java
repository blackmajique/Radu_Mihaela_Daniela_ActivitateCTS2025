package Decorator.Clase;

public class NotaDePlataCraciun extends PrintareFelicitare{

    public NotaDePlataCraciun(NotaP nodaDePlata) {
        super(nodaDePlata);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("Craciun fericit! - 2025");
    }
}
