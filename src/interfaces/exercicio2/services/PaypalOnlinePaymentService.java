package interfaces.exercicio2.services;

public class PaypalOnlinePaymentService implements OnlinePaymentService {

    private static final double FEE_PERCENTAGEM = 0.02;
    private static final double INTEREST_PER_MONTH = 0.01;

    //taxa de pagamento
    @Override
    public double paymentFee(double amount){
        return amount * FEE_PERCENTAGEM;
    }

    //juros
    @Override
    public double insterest(double amount, int months){
        return amount * INTEREST_PER_MONTH * months;
    }
}
