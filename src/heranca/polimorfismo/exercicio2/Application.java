package heranca.polimorfismo.exercicio2;

import heranca.polimorfismo.exercicio2.entities.Company;
import heranca.polimorfismo.exercicio2.entities.Individual;
import heranca.polimorfismo.exercicio2.entities.TaxPayer;

import java.text.ParseException;
import java.util.*;

public class Application {
    public static void main(String[] args) throws ParseException {

        int numberOfTaxPlayers = 0;
        List<TaxPayer> taxPayers = new ArrayList<>();
        double totalTaxes = 0.0;

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of tax players: ");
        numberOfTaxPlayers = scanner.nextInt();

        for (int i = 1; i <= numberOfTaxPlayers; i++) {
            char individualOrCompany;
            String name;
            double anualIncome;

            System.out.println("Tax player #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            individualOrCompany = scanner.next().charAt(0);

            System.out.print("Name: ");
            scanner.nextLine();
            name = scanner.nextLine();
            System.out.print("Anual income: ");
            anualIncome = scanner.nextDouble();

            if (individualOrCompany == 'i') {
                double healthExpenditures;

                System.out.print("Health expenditures: ");
                healthExpenditures = scanner.nextDouble();

                taxPayers.add(new Individual(name, anualIncome, healthExpenditures));
            } else {
                int numberOfEmployees;

                System.out.print("Number of employees: ");
                numberOfEmployees = scanner.nextInt();

                taxPayers.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID: ");
        for (TaxPayer taxPayer : taxPayers) {
            totalTaxes += taxPayer.tax();
            System.out.println(taxPayer);
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f", totalTaxes);

        scanner.close();
    }
}
