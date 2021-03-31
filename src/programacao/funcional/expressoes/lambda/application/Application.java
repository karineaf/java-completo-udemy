package programacao.funcional.expressoes.lambda.application;

import generics.set.map.exercicio2.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        // -> /home/karine/Desktop/treinamentos/java-completo/java-completo/src/programacao/funcional/expressoes/lambda/in2.cvs
        String path = scanner.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Employee> employees = new ArrayList<>();

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            Double salary = scanner.nextDouble();

            Comparator<String> comparator = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> emails = employees.stream()
                    .filter(x -> x.getSalary() > salary)
                    .map(Employee::getEmail)
                    .sorted(comparator)
                    .collect(Collectors.toList());

            System.out.println("Email of people whose salary is more than " + salary);
            emails.forEach(System.out::println);

            Double sum = employees.stream()
                    .filter(x -> x.getName().startsWith("M"))
                    .map(Employee::getSalary)
                    .reduce(0.0, Double::sum);

            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}
