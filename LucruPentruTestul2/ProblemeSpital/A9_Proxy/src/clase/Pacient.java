package clase;

public class Pacient implements IInternare {
    private boolean areAsigurareDeSanatate;
    IInternare internare;

    public Pacient(boolean areAsigurareDeSanatate, IInternare internare) {
        this.areAsigurareDeSanatate = areAsigurareDeSanatate;
        this.internare= internare;
    }

    @Override
    public void internare() {
       if(areAsigurareDeSanatate) {
           internare.internare();
       }
       else {
           System.out.println("Pacientul nu are asigurare de sanatate");
       }
    }
}
