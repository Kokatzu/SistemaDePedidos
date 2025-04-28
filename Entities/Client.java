package Entities;

import Utils.FormatUtils;

public class Client {
    StringBuilder sb = new StringBuilder();

    private int id;
    private String name;
    private String cpf;
    private String email;
    private String endereco;

    public Client(){
    }

    public Client(int id, String name, String cpf, String email, String endereco) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
    }

    public String showBasicInfo(){
        sb.append("#" + id + "  |  ");
        sb.append("Nome: " + name + "  |  ");
        sb.append("Email: " + email + "\n");
        return sb.toString();
    }

    @Override
    public String toString(){
        sb.append("#" + id + "  |  " );
        sb.append("Nome: " + name + "  |  ");
        sb.append("Email: " + email + "\n");
        sb.append("Endereço: " + endereco + "  |  ");
        sb.append("CPF: " + FormatUtils.cpfFormat(cpf));

        return sb.toString();
    }
}
