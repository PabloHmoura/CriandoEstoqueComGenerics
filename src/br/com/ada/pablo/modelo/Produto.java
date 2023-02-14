package br.com.ada.pablo.modelo;

public abstract class Produto {

    private String nome;

    public String getNome() {
        return nome;
    }

    public Produto(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
