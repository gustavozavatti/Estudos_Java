package org.example.entities;
import org.example.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDate date;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> listItems = new ArrayList<>();

    public Order(){
    }

    public Order(LocalDate date, OrderStatus status, Client client){
        this.date = date;
        this.status = status;
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getListItems() {
        return listItems;
    }

    public void addItem(OrderItem itemAdd){
        listItems.add(itemAdd);
    }

    public void removeItem(OrderItem itemRemove){
        listItems.remove(itemRemove);
    }

    public Double total(){
        double sum = 0.0;
        for (OrderItem item : listItems){
            sum += item.subTotal();
        }
        return sum;
    }

    @Override

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY: \n");
        sb.append("Order moment: ").append(date).append("\n");
        sb.append("Order status: ").append(status).append("\n");
        sb.append("Client: ").append(client.getName()).append(" ").append(client.getBirthDate()).append(" - ").append(client.getEmail()).append("\n");
        sb.append("Order items: ").append("\n");
        for(OrderItem item : listItems) {
            sb.append(item.toString()).append("\n");
        }
        sb.append("Total price: $").append(String.format("%.2f", total()));
        return sb.toString();
    }

}
