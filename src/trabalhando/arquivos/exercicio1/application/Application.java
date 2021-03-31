package trabalhando.arquivos.exercicio1.application;

import trabalhando.arquivos.exercicio1.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        // -> /home/karine/Desktop/treinamentos/java-completo/java-completo/src/trabalhando/arquivos/in.cvs
        String stringPath = scanner.nextLine();

        List<Product> products = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(stringPath))) {
            String line = br.readLine();
            while (line != null) {

                String[] parts = line.split(",");
                String name = parts[0];
                double price = Double.parseDouble(parts[1]);
                int quantity = Integer.parseInt(parts[2]);

                Product product = new Product(name, price, quantity);
                products.add(product);
                System.out.println(product);

                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        File path = new File(stringPath);

        String outPath = path.getParent() + "/summary.csv";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outPath))) {
            for (Product product : products) {
                bw.write(String.valueOf(product));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
