package construtores.thiss.sobrecarga.encapsulamento.exercicio1.application;

import construtores.thiss.sobrecarga.encapsulamento.exercicio1.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        int accountNumber;
        String accountHolder;
        char isInicialDeposit;
        double amount;
        Account account;

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        accountNumber = scanner.nextInt();
        System.out.print("Enter account holder: ");
        scanner.nextLine();
        accountHolder = scanner.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        isInicialDeposit = scanner.next().charAt(0);

        if(isInicialDeposit =='y'){
            System.out.print("Enter initial deposit value: ");
            amount = scanner.nextDouble();
            account = new Account(accountNumber, accountHolder, amount);
        }else
            account = new Account(accountNumber, accountHolder);

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account.toString());
        System.out.println();

        System.out.print("Enter a deposit value: ");
        amount = scanner.nextDouble();
        account.deposit(amount);
        System.out.println("Updated account data: ");
        System.out.println(account.toString());
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        amount = scanner.nextDouble();
        account.withdraw(amount);
        System.out.println("Updated account data: ");
        System.out.println(account.toString());

        scanner.close();

    }
}
