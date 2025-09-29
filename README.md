# 🚚 Sistema de Frete

## 📖 Sobre o Projeto

Este projeto foi desenvolvido como **atividade de aula** (23/09/2025) para modelar um sistema de cálculo de custo de frete para uma empresa de logística.
O objetivo é calcular o custo total de uma entrega, que é composto pelo **custo do veículo** + **custo do entregador**, variando de acordo com o tipo escolhido.

O sistema foi implementado em **Java** no **Eclipse IDE**.

---

## 🛠️ Funcionalidades

* Interface `Fretavel` que define o método de cálculo de frete.
* Classe abstrata `Veiculo` e subclasses:

  * 🚗 **Carro** → custo = distância × 1.25
  * 🏍️ **Motocicleta** → custo = distância × 0.45
* Classe abstrata `Entregador` e subclasses:

  * 👨‍💼 **Funcionário** → custo fixo de R$ 5,00 por entrega
  * 👷 **Autônomo** → custo = distância × 0.95
* Classe `ServicoDeEntrega` que gerencia os itens e calcula o custo total da entrega.
* Classe `Main` para simulação das entregas.

---

## 📂 Estrutura do Projeto

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

## ▶️ Como Executar no Eclipse

1. Abra o **Eclipse**.
2. Vá em **File > New > Java Project** → nomeie como `SistemaFrete`.
3. Clique com o botão direito em `src` → **New > Package** → nome: `frete`.
4. Crie as classes e interfaces acima dentro do pacote `frete`.
5. No arquivo `Main.java`, clique em **Run > Run As > Java Application**.
6. O console exibirá o resultado das simulações.

---

## 📊 Exemplos de Saída

### Simulação 1

Entrega de **10 km** feita por um **Funcionário com Carro**:

```
Entrega 1 (10km - Funcionario + Carro): R$ 17.5
```

### Simulação 2

Entrega de **25 km** feita por um **Autônomo com Motocicleta**:

```
Entrega 2 (25km - Autonomo + Motocicleta): R$ 35.0
```

---

## 🧑‍💻 Autor

Projeto desenvolvido por **Jhonatan Thiago** como parte das atividades de aula de **Programação Orientada a Objetos**.