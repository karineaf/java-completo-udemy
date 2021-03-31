package enumeracoes.composicao.exercicio1.application;

import enumeracoes.composicao.exercicio1.entities.Client;
import enumeracoes.composicao.exercicio1.entities.Order;
import enumeracoes.composicao.exercicio1.entities.OrderItem;
import enumeracoes.composicao.exercicio1.entities.Product;
import enumeracoes.composicao.exercicio1.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Application {
    public static void main(String[] args) throws ParseException {

        String name;
        String email;
        Date birthDate;
        Client client;

        OrderStatus status;
        Integer quantityOrderItem;
        Order order;

        String productName;
        Double productPrice;
        Integer productQuantity;

        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Email: ");
        email = scanner.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        birthDate = sdf.parse(scanner.nextLine());
        client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        status = OrderStatus.valueOf(scanner.nextLine());

        order = new Order(new Date(), status, client);

        System.out.print("How many items to this order: ");
        quantityOrderItem = scanner.nextInt();
        for (int i=1; i<=quantityOrderItem; i++){
            System.out.println("Enter #" + i + " item data");
            System.out.print("Product name: ");
            scanner.nextLine();
            productName = scanner.nextLine();
            System.out.print("Product price: ");
            productPrice = scanner.nextDouble();
            System.out.print("Quantity: ");
            productQuantity = scanner.nextInt();
            OrderItem orderItem = new OrderItem(productQuantity, productPrice, new Product(productName, productPrice));
            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println(order);

        scanner.close();
    }
}
