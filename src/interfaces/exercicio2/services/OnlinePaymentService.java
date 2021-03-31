package interfaces.exercicio2.services;

public interface OnlinePaymentService {
    double paymentFee(double amount);
    double insterest(double amount, int months);
}
