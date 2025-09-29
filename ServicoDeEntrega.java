package frete;

import java.util.ArrayList;
import java.util.List;

public class ServicoDeEntrega {
    private List<Fretavel> itens;

    public ServicoDeEntrega() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Fretavel item) {
        itens.add(item);
    }

    public double calcularCustoTotal(double distancia) {
        double total = 0;
        for (Fretavel item : itens) {
            total += item.calcularCustoFrete(distancia);
        }
        return total;
    }

    public void limparItens() {
        itens.clear();
    }
}
