package Entities;

import Entities.Enums.StatusOrder;
import Utils.FormatUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ClientOrder {
    StringBuilder sb = new StringBuilder();
    List<Product> productList = new ArrayList<>();

    private LocalDateTime timeOfOrder;
    private Client client;
    private int id;
    private StatusOrder statusOrder;

    public ClientOrder(Client client, int id, StatusOrder statusOrder) {
        this.timeOfOrder = LocalDateTime.now();
        this.client = client;
        this.id = id;
        this.statusOrder = statusOrder;
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

    public int clientOrderId(){
        return id;
    }

    @Override
    public String toString(){
        sb.append("----------------------------------------------------------------------------------------" + "\n");
        sb.append("Id do pedido: " + id + "  |  ");
        sb.append("Feito em: " + FormatUtils.dateTimeFormat(timeOfOrder) + "\n");
        sb.append("Status: " + statusOrder.showStatusOrder() + "\n");
        sb.append("----------------------------------------------------------------------------------------" + "\n");
        sb.append(client + "\n");
        sb.append("----------------------------------------------------------------------------------------" + "\n");
        sb.append("Produtos no carrinho" + "\n");
        sb.append("----------------------------------------------------------------------------------------" + "\n");
        for (Product p : productList){
            sb.append(p + "\n");
        }
        sb.append("----------------------------------------------------------------------------------------" + "\n");
        sb.append("Total do pedido: " + FormatUtils.priceFormat(totalInProducts()) + "\n");
        sb.append("----------------------------------------------------------------------------------------" + "\n");
        return sb.toString();
    }
}

