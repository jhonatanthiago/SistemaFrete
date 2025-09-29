package frete;

public class Main {
    public static void main(String[] args) {
        // Simulação 1: Funcionario + Carro em 10km
        ServicoDeEntrega entrega1 = new ServicoDeEntrega();
        Funcionario funcionario = new Funcionario("Carlos");
        Carro carro = new Carro("ABC-1234", 2020);

        entrega1.adicionarItem(funcionario);
        entrega1.adicionarItem(carro);

        double custo1 = entrega1.calcularCustoTotal(10);
        System.out.println("Entrega 1 (10km - Funcionario + Carro): R$ " + custo1);

        // Simulação 2: Autonomo + Motocicleta em 25km
        ServicoDeEntrega entrega2 = new ServicoDeEntrega();
        Autonomo autonomo = new Autonomo("João");
        Motocicleta moto = new Motocicleta("XYZ-9876", 2022);

        entrega2.adicionarItem(autonomo);
        entrega2.adicionarItem(moto);

        double custo2 = entrega2.calcularCustoTotal(25);
        System.out.println("Entrega 2 (25km - Autonomo + Motocicleta): R$ " + custo2);
    }
}