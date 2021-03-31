package interfaces.exercicio2.services;

import interfaces.exercicio2.entities.Contract;
import interfaces.exercicio2.entities.Installment;

import java.util.Calendar;
import java.util.Date;

public class PaymentService {

    private Integer installmenstsNumber;

    private OnlinePaymentService onlinePaymentService;

    public PaymentService(int installmenstsNumber, OnlinePaymentService onlinePaymentService) {
        this.installmenstsNumber = installmenstsNumber;
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months){
        double basicValue = contract.getTotalValue() / months;
        for(int month=1; month<=months; month++){
            double monthValue = basicValue;

            monthValue += onlinePaymentService.paymentFee(monthValue);
            monthValue += onlinePaymentService.insterest(monthValue, month);
            contract.addInstallment(new Installment(addMonths(contract.getDate(), month), monthValue));
        }
    }

    public Date addMonths(Date date, int month){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, month);
        return calendar.getTime();
    }

}
