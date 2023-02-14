package br.com.ada.pablo.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Estoque<T extends Produto> {

    public static  <T extends Produto> T retornaProduto(Estoque<T> classe, T t) {

        return t;
    }
    List<T> list = new ArrayList<>();


    public void adicionar(T produto) {
        this.list.add(produto);
    }

    public void deletar(T nomeProduto) {
        this.list.removeIf(t -> t.getNome().contains(nomeProduto.getNome()));
    }

    public void pesquisar(String nome) {
        Produto produto = list.stream().filter(t -> t.getNome().equalsIgnoreCase(nome)).findAny().get();
        System.out.println(produto);
    }

    public void listarPorTipo(T tipoClasse) {
        List lista = list.stream().filter(t -> t.getClass().equals(tipoClasse.getClass())).collect(Collectors.toList());
        lista.forEach(System.out::println);
    }


}
