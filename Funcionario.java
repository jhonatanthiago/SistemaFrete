package frete;

public class Funcionario extends Entregador {
    public Funcionario(String nome) {
        super(nome);
    }

    @Override
    public double calcularCustoFrete(double distanciaEmKm) {
        return 5.00; // valor fixo
    }
}