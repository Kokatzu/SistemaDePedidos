package Entities;

import Utils.FormatUtils;

import java.util.ArrayList;
import java.util.List;

public class OrderList {
    List<ClientOrder> clientOrderList = new ArrayList<>();

    public void addOrderClient(ClientOrder clientOrder){
        clientOrderList.add(clientOrder);
    }

    public String findOrderById(int id){
        StringBuilder sb = new StringBuilder();
        for(ClientOrder clientOrder : clientOrderList){
            if (clientOrder.clientOrderId() == id){
                return clientOrder.toString();
            }
        }
        sb.append("Id de pedido não encontrado tente novamente!" + "\n");
        return sb.toString();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(ClientOrder clientOrder : clientOrderList){
            sb.append(clientOrder);
            sb.append("\n");
            sb.append("\n");
            sb.append("\n");
        }
        return sb.toString();
    }
}
