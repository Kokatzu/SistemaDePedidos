package Application;

import Entities.*;
import Entities.Enums.StatusOrder;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Client joao = new Client(1, "Joao Guilherme", "12345678910", "joao@gmail.com", "Rua Paqueta 1300");
        Client valeria = new Client(2, "Valéria De Almeida", "12345678910", "VaAlmeida@gmail.com", "Rua Irineu 420");
        Client ana = new Client(3, "Ana Eduarda", "12345678910", "ana@gmail.com", "Rua Taubaté 123");
        Client eduardo = new Client(4, "Eduardo Da Cunha Silva Da Silva", "12345678910", "EduardoDaSilvaSilva@gmail.com", "Rua Da Silva Santos 777");

        ClientList clientList = new ClientList();
        clientList.addClient(joao);
        clientList.addClient(valeria);
        clientList.addClient(ana);
        clientList.addClient(eduardo);

        ClientOrder clientOrder1 = new ClientOrder(joao, 1, StatusOrder.PROCESSING);
        ClientOrder clientOrder2 = new ClientOrder(valeria, 2, StatusOrder.PAYMENTCONFIRMED);
        ClientOrder clientOrder3 = new ClientOrder(ana, 3, StatusOrder.SHIPPED);
        ClientOrder clientOrder4 = new ClientOrder(eduardo, 4, StatusOrder.CANCELED);

        Product p1 = new Product("Betoneira Menegotti", 21999.99, 3);
        Product p2 = new Product("Honda Civic 2025", 219950.99, 1);
        Product p3 = new Product("Geladeira Brastemp Inox duas portas", 5890.99, 1);
        Product p4 = new Product("Kit de tricô com 499 peças", 159.90, 4);

        clientOrder1.addProduct(p1);
        clientOrder2.addProduct(p2);
        clientOrder3.addProduct(p3);
        clientOrder4.addProduct(p4);

        OrderList orderList = new OrderList();

        orderList.addOrderClient(clientOrder1);
        orderList.addOrderClient(clientOrder2);
        orderList.addOrderClient(clientOrder3);
        orderList.addOrderClient(clientOrder4);

        System.out.println("Sistema De Gerenciamento De Pedidos.");
        System.out.println("Digite o número da função desejada");
        System.out.println("------------------------");
        System.out.println("1 - Listagem de Clientes");
        System.out.println("2 - Puxar pedido por ID");
        System.out.println("3 - Todos os pedidos");
        System.out.println("------------------------");

        int chooseOption = sc.nextInt();
        switch (chooseOption) {
            case 1:
                System.out.println(clientList.basicInfoClient());
                break;

                case 2:
                System.out.print("Digite o id do pedido: ");
                int id = sc.nextInt();

                System.out.println("Pedido referente ao Id = " + id);
                System.out.println(orderList.findOrderById(id));
                break;

            case 3:
                System.out.println(orderList);
                break;

            default:
                System.out.println("Valor digitado inválido, tente novamente");
                break;
        }
    }
}
