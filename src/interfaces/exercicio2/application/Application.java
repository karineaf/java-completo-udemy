package interfaces.exercicio2.application;

import interfaces.exercicio1.entities.CarRental;
import interfaces.exercicio1.entities.Vehicle;
import interfaces.exercicio1.services.BrazilTaxService;
import interfaces.exercicio1.services.RentalService;
import interfaces.exercicio2.entities.Contract;
import interfaces.exercicio2.entities.Installment;
import interfaces.exercicio2.services.PaymentService;
import interfaces.exercicio2.services.PaypalOnlinePaymentService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws ParseException {

        int number;
        Date date;
        double contractValue;
        Contract contract;
        int installmenstsNumber;
        PaymentService paymentService;

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter contract data");
        System.out.print("Number: ");
        number = scanner.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        scanner.nextLine();
        date = sdf.parse(scanner.nextLine());
        System.out.print("Contract value: ");
        contractValue = scanner.nextDouble();

        contract = new Contract(number, date, contractValue);

        System.out.print("Enter number of installments: ");
        installmenstsNumber = scanner.nextInt();

        paymentService = new PaymentService(installmenstsNumber, new PaypalOnlinePaymentService());

        paymentService.processContract(contract, installmenstsNumber);

        System.out.println("Installments: ");
        contract.getInstallments().forEach(System.out::println);

        scanner.close();
    }
}
