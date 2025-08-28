package FiltrodeProdutosemPromocao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    static class Produto {
        String nome;
        double preco;
        int quantidadeEmEstoque;

        // Construtor da classe Produto
        public Produto(String nome, double preco, int quantidadeEmEstoque) {
            this.nome = nome;
            this.preco = preco;
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        }

        public String getNome() {
            return nome;
        }
    }

    public static void main(String[] args) {
        // Scanner para ler entrada do usuário
        Scanner scanner = new Scanner(System.in);
        var part = 0;
        // Lendo a quantidade de produtos
        int n = scanner.nextInt();
        scanner.nextLine();


         String linha = scanner.nextLine();

        // TODO: Crie a lista para armazenar os produtos:

        List<Produto> produtos = new ArrayList<>();

        List<Produto> produtosMaiorQue50 = new ArrayList<>();

        // Divisão das linha por vírgula para obter os dados de cada produto
        String[] partes = linha.split(",\\s*");

        // TODO: Implemente loop para percorrer a lista de partes, processando as informações de cada produto:
        for (int i = 0; i < n; i++) {
            String nome = partes[part].trim();

            double preco = Double.parseDouble(partes[part + 1].trim());

            int quantidadeEmEstoque = Integer.parseInt(partes[part + 2].trim());

            ++part;
            ++part;
            ++part;

            // TODO: Adicione o produto na lista:

            produtos.add(new Produto(nome,preco,quantidadeEmEstoque));
            // TODO: Crie a lista para armazenar os produtos com mais de 50 unidades em estoque:

            // TODO: Filtre os produtos com mais de 50 unidades em estoque:

            produtosMaiorQue50 = produtos.stream().filter(c -> c.quantidadeEmEstoque > 50).toList();
        }
        // TODO: Exiba os nomes dos produtos com mais de 50 unidades em estoque:
        String nomes =  produtosMaiorQue50.stream().map(Produto::getNome).collect(Collectors.joining(", "));
        System.out.println(nomes);

    }




}
