package estrutura.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Application {

    // --- Exercicio 5 --- //
    private static final double VALOR_CACHORRO_QUENTE = 4.00;
    private static final double VALOR_X_SALADA = 4.50;
    private static final double VALOR_X_BACON = 5.00;
    private static final double VALOR_TORRADA_SIMPLES = 2.00;
    private static final double VALOR_REFRIGERANTE = 1.50;

    public static void main(String[] args) {

        // --- Exercicio 1 --- //
        System.out.println("--- Exercicio 1 ---");

        int numero;

        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextInt();

        if (numero < 0)
            System.out.print("NEGATIVO");
        else
            System.out.print("NÃO NEGATIVO");

        System.out.println();


        // --- Exercicio 2 --- //
        System.out.println("--- Exercicio 2 ---");
        int numero2;

        numero2 = scanner.nextInt();

        if (numero2 % 2 == 0)
            System.out.print("PAR");
        else
            System.out.print("IMPAR");

        System.out.println();


        // --- Exercicio 3 --- //
        System.out.println("--- Exercicio 3 ---");
        int a;
        int b;

        a = scanner.nextInt();
        b = scanner.nextInt();

        if (a%b == 0 || b%a == 0)
            System.out.print("Sao Multiplos");
        else
            System.out.print("Nao sao Multiplos");

        System.out.println();


        // --- Exercicio 4 --- //
        System.out.println("--- Exercicio 4 ---");
        int horaInicial;
        int horaFinal;
        int duracao;

        horaInicial = scanner.nextInt();
        horaFinal = scanner.nextInt();

        if (horaInicial >= horaFinal)
            duracao = 24 - horaInicial + horaFinal;
        else
            duracao = horaFinal - horaInicial;

        System.out.print("O JOGO DUROU " + duracao + " HORAS(S)");
        System.out.println();


        // --- Exercicio 5 --- //
        System.out.println("--- Exercicio 5 ---");

        int codigo;
        int quantidade;
        double valor;

        Locale.setDefault(Locale.US);

        codigo = scanner.nextInt();
        quantidade = scanner.nextInt();

        switch (codigo) {
            case 1:
                valor = quantidade * VALOR_CACHORRO_QUENTE;
                break;
            case 2:
                valor = quantidade * VALOR_X_SALADA;
                break;
            case 3:
                valor = quantidade * VALOR_X_BACON;
                break;
            case 4:
                valor = quantidade * VALOR_TORRADA_SIMPLES;
                break;
            case 5:
                valor = quantidade * VALOR_REFRIGERANTE;
                break;
            default:
                throw new IllegalStateException("Código incorreto: " + codigo);
        }

        System.out.printf("Total: %.2f", valor);
        System.out.println();


        // --- Exercicio 6 --- //
        System.out.println("--- Exercicio 6 ---");
        double valor6;

        valor6 = scanner.nextDouble();

        if(valor6 > 0 && valor6 <= 25)
            System.out.print("Intervalo [0,25]");
        else if (valor6 > 25 && valor6 <= 50)
            System.out.print("Intervalo (25,50]");
        else if (valor6 > 50 && valor6 <= 75)
            System.out.print("Intervalo (50,75]");
        else if (valor6 > 75 && valor6 <= 100)
            System.out.print("Intervalo (75,100]");
        else
            System.out.print("Fora de intervalo");

        System.out.println();


        // --- Exercicio 7 --- //
        System.out.println("--- Exercicio 7 ---");
        double x;
        double y;

        x = scanner.nextDouble();
        y = scanner.nextDouble();

        if (x == 0 && y == 0)
            System.out.print("Origem");
        else if (x > 0) {
            if(y == 0)
                System.out.print("Eixo X");
            else if (y>0)
                System.out.print("Q1");
            else
                System.out.print("Q4");
        }else if (y < 0){
            if(y == 0)
                System.out.print("Eixo Y");
            else if (y>0)
                System.out.print("Q2");
            else
                System.out.print("Q3");
        }
        System.out.println();


        // --- Exercicio 8 --- //
        System.out.println("--- Exercicio 8 ---");
        double salario;

        salario = scanner.nextDouble();

        if (salario >= 0 && salario <= 2000)
            System.out.print("Isento");
        else {
            double imposto = 0.0;

            if(salario <= 3000)
                imposto = (salario-2000) * 0.08;
            if(salario <= 4500)
                imposto = (salario - 3000) * 0.18 + (1000 * 0.08);
            if(salario > 4500)
                imposto = (salario - 4500) * 0.28 + (1500 * 0.18) + (1000 * 0.08);

            System.out.printf("R$ %.2f", imposto);
        }

        scanner.close();
    }
}
