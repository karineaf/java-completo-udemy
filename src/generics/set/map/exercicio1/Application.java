package generics.set.map.exercicio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        int numberOfStudents;
        Set<Integer> listOfStudents = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students for course A? ");
        numberOfStudents = scanner.nextInt();

        for(int i=0; i<numberOfStudents; i++){
            int student = scanner.nextInt();
            listOfStudents.add(student);
        }

        System.out.print("How many students for course B? ");
        numberOfStudents = scanner.nextInt();
        for(int i=0; i<numberOfStudents; i++){
            int student = scanner.nextInt();
            listOfStudents.add(student);
        }

        System.out.print("How many students for course C? ");
        numberOfStudents = scanner.nextInt();
        for(int i=0; i<numberOfStudents; i++){
            int student = scanner.nextInt();
            listOfStudents.add(student);
        }

        System.out.println("Total students:" + listOfStudents.size());

        scanner.close();
    }
}
