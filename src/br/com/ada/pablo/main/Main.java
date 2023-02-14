package br.com.ada.pablo.main;

import br.com.ada.pablo.modelo.Brinquedo;
import br.com.ada.pablo.modelo.Estoque;
import br.com.ada.pablo.modelo.Livro;
import br.com.ada.pablo.modelo.Produto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*while (true){
            Scanner scanner = new Scanner(System.in);

            System.out.println("O que deseja fazer?");
            int escolha = scanner.nextInt();
            scanner.skip("((?<!\\R)\\s)*");
        }*/
        Brinquedo brinquedo = new Brinquedo("Barbie");
        Livro brinquedo1 = new Livro("Nozes");
        Brinquedo brinquedo2 = new Brinquedo("outro");
        Estoque<Brinquedo> brinquedoEstoque = new Estoque<>();
        Estoque<Livro> livroEstoque = new Estoque<>();
        brinquedoEstoque.adicionar(brinquedo);
        livroEstoque.adicionar(brinquedo1);
        brinquedoEstoque.adicionar(brinquedo2);
    }
}
