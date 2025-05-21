package clase;

public class CreditSimplu implements ICredit{
    @Override
    public void printareCredit(String numeBeneficiar, float sumaCredit) {
        System.out.println("Acesta este un credit simplu al lui " + numeBeneficiar + " de " + sumaCredit);
    }
}
