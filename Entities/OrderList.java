package Entities;

import java.util.ArrayList;
import java.util.List;

public class OrderList {
    List<ClientOrder> clientOrderList = new ArrayList<>();

    public void addOrderClient(ClientOrder clientOrder){
        clientOrderList.add(clientOrder);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(ClientOrder clientOrder : clientOrderList){
            sb.append(clientOrder);
        }
        return sb.toString();
    }
}
