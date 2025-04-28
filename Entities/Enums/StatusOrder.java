package Entities.Enums;

public enum StatusOrder {
    PROCESSING("Processando"),
    PAYMENTCONFIRMED("Pagamento Confirmado"),
    SHIPPED("Enviado"),
    CANCELED("Cancelado");

    private String description;

    StatusOrder(String description){
        this.description = description;
    }

    public String showStatusOrder(){
        return description;
    }
}
