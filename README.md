# Sistema de Pedidos

Projeto de gerenciamento de pedidos desenvolvido em Java.

## 🎯 Sobre o projeto

Este projeto foi desenvolvido como uma **base de testes e aprendizado** em Java, com foco em:

- Aplicação prática de conceitos de Programação Orientada a Objetos (POO)
- Organização de código em pacotes (separação por responsabilidade)
- Uso de `Enum` para controle de estados de objetos
- Implementação de utilitários (`Utils`) para formatação de dados
- Desenvolvimento de práticas de boas estruturas de saída (visualização de dados em terminal)

A ideia principal é criar um **sistema de pedidos** simples e funcional, que sirva como **laboratório** para:

- Experimentar boas práticas de código
- Aprimorar a clareza e a apresentação de informações
- Evoluir gradualmente para versões mais robustas (com Banco de Dados, Interfaces Gráficas, etc.)

Este projeto está em constante evolução conforme novos aprendizados são incorporados.

---

## 📋 Funcionalidades

- Cadastro de clientes
- Cadastro de produtos
- Criação de pedidos
- Associação de clientes e produtos aos pedidos
- Visualização de pedidos em formato estruturado
- Formatação de valores em Real Brasileiro (R$ XX.XXX,XX)
- Formatação de datas (dd/MM/yyyy às HH:mm)
- Enumerações para status de pedidos:
  - Processando
  - Pagamento Confirmado
  - Enviado
  - Cancelado

## 🛠 Tecnologias e recursos usados

- Java (JDK 17 ou superior)
- Programação orientada a objetos (POO)
- Uso de `StringBuilder` para construção otimizada de strings
- Enums para controle de estado
- Utilitários (`FormatUtils`) para:
  - Formatar preços
  - Formatar datas
- Organização de pacotes:
  - `Entities` (entidades do sistema)
  - `Utils` (funções auxiliares de formatação)
