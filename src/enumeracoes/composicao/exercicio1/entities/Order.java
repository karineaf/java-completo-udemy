package enumeracoes.composicao.exercicio1.entities;

import enumeracoes.composicao.exercicio1.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> orderItems = new ArrayList<>();

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem orderItem){
        orderItems.add(orderItem);
    }

    public void removeItem(OrderItem orderItem){
        orderItems.remove(orderItem);
    }

    public Double total(){
        double total = 0;
        for (OrderItem item: orderItems)
            total += item.subTotal();
        return total;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder()
                .append("ORDER SUMARY: \n")
                .append("Order moment: ").append(sdf.format(moment))
                .append("\nOrder status: ").append(status)
                .append("\nClient: ").append(client)
                .append("\nOrder items: \n");

                for (OrderItem orderItem: orderItems)
                    sb.append(orderItem).append("\n");

                sb.append("Total price: $").append(String.format("%.2f", total()));
        return sb.toString();
    }

}
