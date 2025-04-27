package Entities;

import Utils.FormatUtils;

import Utils.FormatUtils;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ClientOrder {
    List<Product> productList = new ArrayList<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    private LocalDateTime timeOfOrder;
    private Client client;
    private int id;

    public ClientOrder(Client client, int id) {
        this.timeOfOrder = LocalDateTime.now();
        this.client = client;
        this.id = id;
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public double totalInProducts(){
        double total = 0;
        for (Product p : productList){
            total += p.totalProducts();
        }
        return total;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("----------------------------------------------------" + "\n");
        sb.append("Id do pedido: " + id + "\n");
        sb.append("Pedido feito em: " + timeOfOrder.format(formatter) + "\n");
        sb.append("----------------------------------------------------" + "\n");
        sb.append("Cliente: " + client + "\n");
        sb.append("----------------------------------------------------" + "\n");
        sb.append("Produtos no carrinho" + "\n");
        sb.append("----------------------------------------------------" + "\n");
        for (Product p : productList){
            sb.append(p + "\n");
        }
        sb.append("----------------------------------------------------" + "\n");
        sb.append("Total do pedido: " + FormatUtils.priceFormat(totalInProducts()) + "\n");
        sb.append("----------------------------------------------------" + "\n");
        return sb.toString();
    }
}

