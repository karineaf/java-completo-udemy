package tratamento.excecoes.exercicio1.application;

import tratamento.excecoes.exercicio1.entities.Account;
import tratamento.excecoes.exercicio1.exceptions.WithdrawException;

import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

            int number;
            String holder;
            double initialBalance;
            double withdrawLimit;
            Account account;
            double amountForWithdraw;

            Locale.setDefault(Locale.US);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter account data ");
            System.out.print("Number: ");
            number = scanner.nextInt();
            System.out.print("Holder: ");
            scanner.nextLine();
            holder = scanner.nextLine();
            System.out.print("Initial balance: ");
            initialBalance = scanner.nextDouble();
            System.out.print("Withdraw limit: ");
            withdrawLimit = scanner.nextDouble();

            account = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.println();

        try {
            System.out.print("Enter amount for withdraw: ");
            amountForWithdraw = scanner.nextDouble();

            account.withdraw(amountForWithdraw);

            System.out.printf("New balance: %.2f", account.getBalance());
        } catch (WithdrawException e){
            System.out.println("Withdraw error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
