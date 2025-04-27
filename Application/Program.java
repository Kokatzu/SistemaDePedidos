package Application;

import Entities.Client;
import Entities.ClientOrder;
import Entities.OrderList;
import Entities.Product;

import java.util.Locale;

public class Program {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);

        Client clientArthur = new Client("Arthur Vasconcelos", "12345678910", "Arthur@gmail.com","Rua Aurora 1200");

        Product p1 = new Product("Computador Gamer Ryzen 5 5600g + AMD Radeon 6600 8GB",4589.90, 1);

        Product p2 = new Product("Monitor LG 120Hz ",859.90, 2);

        ClientOrder orderArthur = new ClientOrder(clientArthur, 1);
        orderArthur.addProduct(p1);
       orderArthur.addProduct(p2);

        Client clientAna = new Client("Ana Maria", "12345678910", "Ana@gmail.com","Rua Aurora 1200");

        Product p3 = new Product("Secador de cabelho Philips",357.90, 1);

        Product p4 = new Product("Chapinha Mondial",259.90, 1);

        ClientOrder orderAna = new ClientOrder(clientAna, 2);

        orderAna.addProduct(p3);
        orderAna.addProduct(p4);


        OrderList orderList = new OrderList();
        orderList.addOrderClient(orderArthur);
        orderList.addOrderClient(orderAna);

        System.out.println(orderList);
    }
}
