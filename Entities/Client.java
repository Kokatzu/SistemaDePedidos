package Entities;

import Utils.FormatUtils;

public class Client {
    private String name;
    private String cpf;
    private String email;
    private String endereco;

    public Client(){
    }

    public Client(String name, String cpf, String email, String endereco) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: " + name + "\n");
        sb.append("Email: " + email + "\n");
        sb.append("Endereço: " + endereco + "\n");
        sb.append("CPF: " + FormatUtils.cpfFormat(cpf) + "\n");

        return sb.toString();
    }
}
