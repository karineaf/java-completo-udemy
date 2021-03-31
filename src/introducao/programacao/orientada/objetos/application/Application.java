package introducao.programacao.orientada.objetos.application;

import introducao.programacao.orientada.objetos.exercicio1.entities.Rectangle;
import introducao.programacao.orientada.objetos.exercicio2.entities.Employee;
import introducao.programacao.orientada.objetos.exercicio3.entities.Student;
import introducao.programacao.orientada.objetos.exercicio4.entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        // --- Exercicio 1 --- //
        Rectangle rectangle = new Rectangle();

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = scanner.nextDouble();
        rectangle.height = scanner.nextDouble();

        System.out.printf("AREA = %.2f%n", rectangle.area());
        System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());
        System.out.println();


        // --- Exercicio 2 --- //
        System.out.println("--- Exercicio 2 ---");
        Employee employee = new Employee();
        double percentage;

        System.out.print("Name: ");
        employee.name = scanner.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = scanner.nextDouble();
        System.out.print("Tax: ");
        employee.tax = scanner.nextDouble();

        System.out.println();
        System.out.println("Employee: " + employee);
        System.out.println();
        System.out.print("Which percentage to incrase salary? ");
        percentage = scanner.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println();
        System.out.println("Update data: " + employee);
        System.out.println();


        // --- Exercicio 3 --- //
        System.out.println("--- Exercicio 3 ---");
        Student student = new Student();

        student.name = scanner.nextLine();
        student.grade1 = scanner.nextDouble();
        student.grade2 = scanner.nextDouble();
        student.grade3 = scanner.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
        System.out.println(student.result());
        System.out.println();


        // --- Exercicio 4 --- //
        System.out.println("--- Exercicio 4 ---");
        double dollarPrice;
        double amount;

        System.out.print("What is the dollar price? ");
        dollarPrice = scanner.nextDouble();
        System.out.print("How mano dollars will be bought? ");
        amount = scanner.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.dollarToReal(dollarPrice, amount));

        scanner.close();
    }
}
