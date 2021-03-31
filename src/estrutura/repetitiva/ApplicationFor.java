package estrutura.repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ApplicationFor {
    public static void main(String[] args) {

        // --- Exercicio 1 - For --- //
        System.out.println("--- Exercicio 1 - For ---");
        int valor;

        Scanner scanner = new Scanner(System.in);
        valor = scanner.nextInt();

        while(valor < 1 || valor > 1000){
            System.out.println("Valor inválido. Digite outro valor");
            valor = scanner.nextInt();
        }

        for(int i=1; i <= valor; i+=2)
            System.out.println(i);

        System.out.println();


        // --- Exercicio 2 - For --- //
        System.out.println("--- Exercicio 2 - For ---");
        int qtdASerLida;
        int qtdIn = 0;
        int qtdOut = 0;

        qtdASerLida = scanner.nextInt();

        for(int i=0; i<qtdASerLida; i++) {
            int valor2 = scanner.nextInt();

            if(valor2 >= 10 && valor2 <=20)
                qtdIn++;
            else
                qtdOut++;
        }

        System.out.println(qtdIn + " in");
        System.out.println(qtdOut + " out");
        System.out.println();


        // --- Exercicio 3 - For --- //
        System.out.println("--- Exercicio 3 - For ---");

        int qtdCasosDeTeste;

        Locale.setDefault(Locale.US);

        qtdCasosDeTeste = scanner.nextInt();

        for(int i=0; i<qtdCasosDeTeste; i++){
            double valor1 = scanner.nextDouble();
            double valor2 = scanner.nextDouble();
            double valor3 = scanner.nextDouble();

            double mediaPoderada =  (valor1 * 2  +  valor2 * 3 + valor3 * 5) / (2 + 3 + 5);

            System.out.printf("%.1f%n", mediaPoderada);
        }
        System.out.println();


        // --- Exercicio 4 - For --- //
        System.out.println("--- Exercicio 4 - For ---");
        int numero;

        numero = scanner.nextInt();

        for(int i=0; i<numero; i++) {
            int valor1 = scanner.nextInt();
            int valor2 = scanner.nextInt();

            if(valor2==0)
                System.out.println("divisao impossivel");
            else{
                double divisao = (double) valor1 / valor2;
                System.out.printf("%.1f%n", divisao);
            }
        }
        System.out.println();


        // --- Exercicio 5 - For --- //
        System.out.println("--- Exercicio 5 - For ---");
        int valor5;
        int fatorial=1;

        valor5 = scanner.nextInt();

        for (int i = 1; i<=valor5; i++)
            fatorial *= i;

        System.out.println(fatorial);
        System.out.println();


        // --- Exercicio 6 - For --- //
        System.out.println("--- Exercicio 6 - For ---");
        int numero6;

        numero6 = scanner.nextInt();

        for(int i=1; i<=numero6; i++)
            if(numero6%i == 0)
                System.out.println(i);

        System.out.println();


        // --- Exercicio 7 - For --- //
        System.out.println("--- Exercicio 7 - For ---");
        int numero7;

        numero7 = scanner.nextInt();

        while (numero7 < 0){
            System.out.println("Número não permitido poi deve ser inteiro positivo. Tente novamente.");
            numero7 = scanner.nextInt();
        }

        for(int i=1; i<=numero7; i++) {
            int quadrado = (int) Math.pow(i,2);
            int cubo = (int) Math.pow(i,3);

            System.out.print(i);
            System.out.print(" ");
            System.out.print(quadrado);
            System.out.print(" ");
            System.out.println(cubo);
        }

        scanner.close();
    }
}
