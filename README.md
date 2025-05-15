# 🍽️ AEDS Restaurante - Sistema de Gerenciamento de Comandas

Trabalho final da disciplina **Algoritmos e Estrutura de Dados (AEDS)** – 2023, com foco na aplicação de **Programação Orientada a Objetos (POO)** em Java.

## 📌 Descrição

Este projeto simula o gerenciamento de um restaurante, permitindo o controle de mesas, clientes e comandas (comida e bebida). Os dados são organizados em classes específicas, promovendo o uso de encapsulamento, herança e polimorfismo, pilares da POO.

O sistema permite:

- Cadastro de clientes.
- Criação e gerenciamento de mesas.
- Abertura de comandas por mesa.
- Inclusão de itens de comida e bebida nas comandas.
- Exibição detalhada das comandas e total por mesa.

## 🧱 Estrutura do Projeto

| Arquivo               | Descrição                                                                 |
|-----------------------|---------------------------------------------------------------------------|
| `CLIENTE.java`        | Representa um cliente com nome e CPF.                                     |
| `MESA.java`           | Gerencia uma mesa com número e uma lista de comandas.                     |
| `COMANDA.java`        | Classe abstrata para comandas (pai de `ComandaComida` e `ComandaBebida`). |
| `ComandaComida.java`  | Subclasse de `COMANDA`, representa um pedido de comida.                   |
| `ComandaBebida.java`  | Subclasse de `COMANDA`, representa um pedido de bebida.                   |
| `RESTAURANTE.java`    | Controla a lista de mesas do restaurante e gerencia suas interações.      |
| `MAIN.java`           | Interface principal via terminal para interação com o sistema.            |

## 💡 Conceitos Aplicados

- Programação Orientada a Objetos
  - Herança
  - Encapsulamento
  - Polimorfismo
- Listas dinâmicas com `ArrayList`
- Estruturas de controle e menus interativos

## ▶️ Como Executar

1. Certifique-se de ter o **Java JDK** instalado (versão 8 ou superior).
2. Compile todos os arquivos `.java`:

```bash
javac *.java
```

```bash
java MAIN
```

## 👨‍🏫 Créditos

Este projeto foi desenvolvido como parte do trabalho final da disciplina de **Algoritmos e Estrutura de Dados (AEDS)** no curso de Desenvolvimento de Sistemas do Coltec-UFMG no 2° ano, do ano de **2023**.

