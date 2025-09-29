package frete;

public abstract class Entregador implements Fretavel {
    private String nome;

    public Entregador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
