# 🏦 Bank Simulator

Simulador de sistema bancário desenvolvido em Java com foco na consolidação de conceitos de Programação Orientada a Objetos (POO), boas práticas de organização em camadas e tratamento de exceções.

---

## 📌 Objetivo do Projeto

Este projeto foi desenvolvido com o objetivo de:

* Consolidar conhecimentos em **Java**
* Aplicar princípios de **Programação Orientada a Objetos**
* Trabalhar com **Herança, Polimorfismo e Encapsulamento**
* Implementar **Enums e Exceções Personalizadas**
* Organizar o código em camadas (application, services, entities, etc.)

O sistema simula operações bancárias básicas via console.

---

## 🚀 Funcionalidades

* ✅ Criação de contas (Current(Corrente) / Savings(Poupança))
* ✅ Criação e associação de clientes
* ✅ Depósito
* ✅ Saque
* ✅ Transferência entre contas
* ✅ Listagem de contas
* ✅ Listagem de transações
* ✅ Tratamento de exceções personalizadas

---

## 🏗️ Estrutura do Projeto

```
Bank_Simulator
│
├── application     → Classe principal (Program)
├── entities        → Entidades do domínio (Account, Customer, Transaction, etc.)
├── services        → Regras de negócio
├── repository      → Armazenamento em memória
├── exceptions      → Exceções personalizadas
```

A arquitetura foi organizada separando responsabilidades, aproximando o projeto de um modelo utilizado em aplicações reais.

---

## 🧠 Conceitos Aplicados

* Programação Orientada a Objetos
* Herança e Polimorfismo
* Enum com método de conversão seguro
* Coleções (`Map`, `List`, `Collection`)
* Tratamento de Exceções (`RuntimeException` customizada)
* Separação de responsabilidades
* Camadas de serviço

---

## 🛠️ Tecnologias Utilizadas

* Java 17+
* Eclipse IDE
* Git & GitHub

---

## ▶️ Como Executar o Projeto

1. Clone o repositório:

```
git clone https://github.com/KauaHVieira/Bank_Simulator.git
```

2. Importe o projeto na sua IDE (Eclipse ou IntelliJ)

3. Execute a classe:

```
application.Program
```

O sistema será executado via console.

---

## 📷 Exemplo de Execução

```
1 - Create Account
2 - Withdraw
3 - Deposit
4 - Transfer
5 - Show Accounts
6 - Show Transactions
7 - Leave/Exit
```

---

## 📈 Melhorias Futuras

* Implementação de testes unitários com JUnit
* Persistência em banco de dados
* Interface gráfica ou API REST com Spring Boot
* Autenticação de usuário
* Melhorias na arquitetura (ex: padrão Factory mais estruturado)

---

## 👨‍💻 Autor

Desenvolvido por Kauã Vieira com foco em evolução técnica e consolidação de fundamentos sólidos em Java.

---

## 📌 Observação

Este projeto tem caráter educacional e foi desenvolvido como parte do processo de aprendizado e consolidação de conceitos fundamentais da linguagem Java.
