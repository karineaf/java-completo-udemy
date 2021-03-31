package estrutura.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Application {

    // --- Exercicio 3 e 7 --- //
    public static final double PI = 3.14159;

    public static void main(String[] args) {

        // --- Exercicio 1 --- //
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n%n", product2, price2);
        System.out.printf("Record: %d year old, code %d and gender: %s%n%n", age, code, gender);
        System.out.printf("Measue with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
        System.out.println();


        // --- Exercicio 2 --- //
        System.out.println("--- Exercicio 2 ---");
        int valor1;
        int valor2;
        int soma;

        Scanner scanner = new Scanner(System.in);
        valor1 = scanner.nextInt();
        valor2 = scanner.nextInt();

        soma = valor1+valor2;

        System.out.println("Soma = " + soma);
        System.out.println();


        // --- Exercicio 3 --- //
        System.out.println("--- Exercicio 3 ---");
        double raio;
        double area;

        Locale.setDefault(Locale.US);

        raio = scanner.nextDouble();

        area = PI * Math.pow(raio, 2);

        System.out.printf("A=%.4f", area);
        System.out.println();


        // --- Exercicio 4 --- //
        System.out.println("--- Exercicio 4 ---");
        int a;
        int b;
        int c;
        int d;
        int diferenca;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();

        diferenca = a * b  -  c * d;

        System.out.println("DIFERENCA = " + diferenca);
        System.out.println();


        // --- Exercicio 5 --- //
        System.out.println("--- Exercicio 5 ---");

        int numFuncionario;
        int hrsTrabalhadas;
        double vlrPorHora;
        double total;

        numFuncionario = scanner.nextInt();
        hrsTrabalhadas = scanner.nextInt();
        vlrPorHora = scanner.nextDouble();

        total = hrsTrabalhadas * vlrPorHora;

        System.out.println("NUMBER = " + numFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", total);
        System.out.println();


        // --- Exercicio 6 --- //
        System.out.println("--- Exercicio 6 ---");
        int codPeca1;
        int qtdPeca1;
        int codPeca2;
        int qtdPeca2;
        double vlrPeca1;
        double vlrPeca2;
        double total6;

        codPeca1 = scanner.nextInt();
        qtdPeca1 = scanner.nextInt();
        vlrPeca1 = scanner.nextDouble();
        codPeca1 = scanner.nextInt();
        qtdPeca2 = scanner.nextInt();
        vlrPeca2 = scanner.nextDouble();

        total6 = qtdPeca1 * vlrPeca1 + qtdPeca2 * vlrPeca2;

        System.out.printf("VALOR A PAGAR: %.2f%n", total6);
        System.out.println();


        // --- Exercicio 7 --- //
        System.out.println("--- Exercicio 7 ---");
        double a7;
        double b7;
        double c7;
        double triangulo;
        double circulo;
        double trapezio;
        double quadrado;
        double retangulo;

        a7 = scanner.nextDouble();
        b7 = scanner.nextDouble();
        c7 = scanner.nextDouble();

        triangulo = (a7 * c7) / 2;
        circulo = PI * Math.pow(c7,2);
        trapezio = ((a7 + b7) * c7) / 2;
        quadrado = Math.pow(b7,2);
        retangulo = a7* b7;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        scanner.close();
    }
}
