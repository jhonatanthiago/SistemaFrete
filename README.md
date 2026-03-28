# 🚚 Sistema de Frete

Projeto acadêmico desenvolvido em Java com foco em Programação Orientada a Objetos (POO).  
Aluno: Jhonatan Thiago  

---

## 📌 Sobre o Projeto

Este projeto consiste em um sistema de cálculo de frete para uma empresa de logística.

A aplicação simula o cálculo do custo total de uma entrega, considerando diferentes tipos de veículos e entregadores, aplicando conceitos de orientação a objetos como herança, abstração e polimorfismo.

O sistema foi desenvolvido com foco em organização, reutilização de código e boas práticas de modelagem.

---

## 🚀 Funcionalidades

- Cálculo do custo de frete com base na distância  
- Suporte a diferentes tipos de veículos  
- Suporte a diferentes tipos de entregadores  
- Cálculo automático do custo total da entrega  
- Simulação de cenários de entrega  

---

## 🧱 Estrutura do Projeto

```

SistemaFrete/
└── src/
└── frete/
├── Fretavel.java
├── Veiculo.java
├── Carro.java
├── Motocicleta.java
├── Entregador.java
├── Funcionario.java
├── Autonomo.java
├── ServicoDeEntrega.java
└── Main.java

```

---

## 🛠 Tecnologias Utilizadas

- Java  
- Programação Orientada a Objetos (POO)  

---

## 🧠 Conceitos Aplicados

- Interfaces (Fretavel)  
- Classes abstratas  
- Herança  
- Polimorfismo  
- Encapsulamento  
- Organização e modelagem de sistemas  

---

## ⚙️ Regras de Cálculo

### 🚗 Veículos
- Carro → custo = distância × 1.25  
- Motocicleta → custo = distância × 0.45  

### 👨‍💼 Entregadores
- Funcionário → custo fixo de R$ 5,00  
- Autônomo → custo = distância × 0.95  

---

## ▶️ Como Executar

### 🔧 Requisitos

- Java JDK 24 ou superior  
- IDE (Eclipse, IntelliJ ou VS Code)

### ▶️ Execução

1. Importe o projeto na sua IDE  
2. Compile as classes  
3. Execute a classe principal:

```

Main.java

```

---

## 📊 Exemplos de Execução

### Simulação 1
Entrega de 10 km feita por Funcionário com Carro:

```

Entrega 1 (10km - Funcionario + Carro): R$ 17.5

```

### Simulação 2
Entrega de 25 km feita por Autônomo com Motocicleta:

```

Entrega 2 (25km - Autonomo + Motocicleta): R$ 35.0

```

---

## 📈 Possíveis Melhorias

- Interface gráfica (GUI)  
- Integração com banco de dados  
- Transformação em API REST  
- Validação de dados de entrada  

---

## 📄 Observação

Projeto acadêmico desenvolvido com foco na prática de conceitos avançados de Programação Orientada a Objetos e modelagem de sistemas.

---

## 👨‍💻 Autor

Jhonatan Thiago  
https://github.com/jhonatanthiago
