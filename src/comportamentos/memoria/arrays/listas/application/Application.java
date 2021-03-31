package comportamentos.memoria.arrays.listas.application;

import comportamentos.memoria.arrays.listas.exercicio1.entities.Rent;
import comportamentos.memoria.arrays.listas.exercicio2.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        // --- Exercicio 1 --- //
        int rentedRooms;
        Rent[] vector = new Rent [10];

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many rooms will be rented? ");
        rentedRooms = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        for (int i=0; i<rentedRooms; i++){
            System.out.println("Rent #"+ (i+1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Room: ");
            int room = scanner.nextInt();
            scanner.nextLine();
            vector[room-1] = new Rent(name, email, room);
            System.out.println();
        }

        System.out.println("Busy rooms: ");
        for (Rent rent : vector)
            if (rent != null)
                System.out.println(rent.toString());

        System.out.println();


        // --- Exercicio 2 --- //
        System.out.println("--- Exercicio 2 ---");
        int registerEmployees;
        List<Employee> employees = new ArrayList<>();
        int idEmployee;
        double percentageIncrease;
        Employee emp;

        System.out.print("How many employees will be registered? ");
        registerEmployees = scanner.nextInt();

        for (int i=1; i<=registerEmployees; i++){
            System.out.println();
            System.out.println("Employee #"+ i + ":");
            System.out.print("Id: ");
            Integer id = scanner.nextInt();
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            Double salary = scanner.nextDouble();
            employees.add(new Employee(id, name, salary));
        }

        System.out.println();
        System.out.print("Enter the employee id that will be have salary increase: ");
        idEmployee = scanner.nextInt();
        emp = employees.stream().filter(x -> x.getId().equals(idEmployee)).findFirst().orElse(null);
        if (emp == null)
            System.out.println("This id does not exist!");
        else {
            System.out.print("Enter the percentage: ");
            percentageIncrease = scanner.nextDouble();
            emp.increaseSalary(percentageIncrease);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee employee: employees)
            System.out.println(employee.toString());

        System.out.println();


        // --- Exercicio 3 --- //
        System.out.println("--- Exercicio 3 ---");
        int x;
        int y;
        int[][] matriz;
        int number;

        x = scanner.nextInt();
        y = scanner.nextInt();

        matriz = new int[x][y];

        for (int i=0; i< matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++)
                matriz[i][j] = scanner.nextInt();

        number = scanner.nextInt();

        for (int i=0; i< matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++)
                if(matriz[i][j] == number){
                    System.out.println("Position: " + i + "," + j + ":");
                    if(j > 0)
                        System.out.println("Left: " + matriz[i][j-1] );
                    if(i > 0)
                        System.out.println("Up: " + matriz[i-1][j]);
                    if(j != matriz[i].length-1)
                        System.out.println("Right: " + matriz[i][j+1]);
                    if(i != matriz.length-1)
                        System.out.println("Down: " + matriz[i+1][j]);
                }

        scanner.close();
    }
}
