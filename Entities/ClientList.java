package Entities;

import java.util.ArrayList;
import java.util.List;

public class ClientList {
    StringBuilder sb = new StringBuilder();

    List<Client> clientList = new ArrayList<>();

    public void addClient(Client client){
        clientList.add(client);
    }

    public String basicInfoClient(){
        for (Client client : clientList){
            sb.append("----------------------------------------------------------------------------------------" + "\n");
            sb.append(client.showBasicInfo());
        }
        return sb.toString();
    }

    @Override
    public String toString(){
        for (Client clients : clientList){
            sb.append(clients);
        }
        return sb.toString();
    }
}
