package estrutura.repetitiva;

import java.util.Scanner;

public class ApplicationWhile {

    public static void main(String[] args) {

        System.out.println("--- Exercicio 1 - While ---");
        int senha;

        Scanner scanner = new Scanner(System.in);
        senha = scanner.nextInt();

        while (senha != 2002){
            System.out.println("Senha Invalida");
            senha = scanner.nextInt();
        }

        System.out.println("Acesso Permitido");
        System.out.println();


        // --- Exercicio 2 - While --- //
        System.out.println("--- Exercicio 2 - While ---");
        int x;
        int y;

        x = scanner.nextInt();
        y = scanner.nextInt();

        while (x != 0 && y != 0){
            if (x > 0) {
                if (y > 0)
                    System.out.println("primeiro");
                else
                    System.out.println("quarto");
            } else {
                if (y > 0)
                    System.out.println("segundo");
                else
                    System.out.println("terceiro");
            }

            x = scanner.nextInt();
            y = scanner.nextInt();
        }
        System.out.println();


        // --- Exercicio 3 - While --- //
        System.out.println("--- Exercicio 3 - While ---");
        int tipoCombustivel;
        int quantidadeAlcool = 0;
        int quantidadeGasolina = 0;
        int quantidadeDiesel = 0;

        tipoCombustivel = scanner.nextInt();

        while (tipoCombustivel != 4){
            if (tipoCombustivel == 1)
                quantidadeAlcool ++;
            else if (tipoCombustivel == 2)
                quantidadeGasolina ++;
            else if (tipoCombustivel == 3)
                quantidadeDiesel ++;
            else
                System.out.println("Código Invalido. Por favor digite um novo código.");

            tipoCombustivel = scanner.nextInt();
        }

        System.out.println("MUITO OBRIGADA");
        System.out.println("Alcool: " + quantidadeAlcool);
        System.out.println("Gasolina: " + quantidadeGasolina);
        System.out.println("Diesel: " + quantidadeDiesel);

        scanner.close();
    }
}
