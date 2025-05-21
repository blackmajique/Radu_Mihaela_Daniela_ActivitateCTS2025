package clase;

public class CreditAdapter implements ICredit{
    private ICredit creditLeasing;

    public CreditAdapter(ICredit creditLeasing) {
        this.creditLeasing = creditLeasing;
    }

    @Override
    public void printareCredit(String numeBeneficiar, float sumaCredit) {
        this.creditLeasing.printareCredit(numeBeneficiar, sumaCredit);
    }
}
