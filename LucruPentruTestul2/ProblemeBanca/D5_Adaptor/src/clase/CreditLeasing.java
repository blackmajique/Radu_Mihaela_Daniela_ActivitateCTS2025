package clase;

public class CreditLeasing implements ICredit {
    @Override
    public void printareCredit(String numeBeneficiar, float sumaCredit) {
        System.out.println("Acesta este un credit leasing al lui " + numeBeneficiar + " de " + sumaCredit);
    }
}
