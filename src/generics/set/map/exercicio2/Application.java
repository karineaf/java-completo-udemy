package generics.set.map.exercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a file full path: ");
        // -> /home/karine/Desktop/treinamentos/java-completo/java-completo/src/generics/set/map/in.cvs
        String stringPath = scanner.nextLine();

        Map<String, Integer> candidates = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(stringPath))) {
            String line = br.readLine();
            while (line != null) {

                String[] parts = line.split(",");
                String candidate = parts[0];
                int newVotes = Integer.parseInt(parts[1]);

                if(candidates.containsKey(candidate))
                    candidates.put(candidate, candidates.get(candidate) + newVotes);
                else
                    candidates.put(candidate, newVotes);

                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (String key : candidates.keySet())
            System.out.println(key + ": " + candidates.get(key));

        scanner.close();
    }
}
