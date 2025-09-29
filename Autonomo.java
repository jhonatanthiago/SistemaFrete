package frete;

public class Autonomo extends Entregador {
    public Autonomo(String nome) {
        super(nome);
    }

    @Override
    public double calcularCustoFrete(double distanciaEmKm) {
        return distanciaEmKm * 0.95;
    }
}