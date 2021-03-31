package heranca.polimorfismo.exercicio1;

import heranca.polimorfismo.exercicio1.entities.ImportedProduct;
import heranca.polimorfismo.exercicio1.entities.Product;
import heranca.polimorfismo.exercicio1.entities.ProductType;
import heranca.polimorfismo.exercicio1.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Application {
    public static void main(String[] args) throws ParseException {

        int numberOfProducts;
        List<Product> products = new ArrayList<>();

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        numberOfProducts = scanner.nextInt();

        for (int i=1; i<=numberOfProducts; i++){
            String name;
            double price;

            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i): ");
            scanner.nextLine();
            ProductType pt = ProductType.getByIdEnum(scanner.nextLine());

            System.out.print("Name: ");
            name = scanner.nextLine();
            System.out.print("Price: ");
            price = scanner.nextDouble();

            if (pt == ProductType.COMMON) {
                products.add(new Product(name, price));
            } else if (pt == ProductType.USED){
                Date manufactureDate;
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

                System.out.print("Manufacture date (DD/MM/YYYY): ");
                scanner.nextLine();
                String date = scanner.nextLine();
                manufactureDate = sdf.parse(date);

                products.add(new UsedProduct(name, price, manufactureDate));
            } else {
                double customsFee;

                System.out.print("Customs fee: ");
                customsFee = scanner.nextDouble();

                products.add(new ImportedProduct(name, price, customsFee));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product product : products)
            System.out.println(product.priceTag());

        scanner.close();
    }

}
