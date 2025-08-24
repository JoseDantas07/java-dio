import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
    }

    public static void main(String[] args) {
        // Scanner para ler entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Lendo a quantidade de produtos
        int n = scanner.nextInt();
        scanner.nextLine();


        String linha = scanner.nextLine();

        // TODO: Crie a lista para armazenar os produtos:
        List<Produto> carrinho = new ArrayList();

        // Divisão das linha por vírgula para obter os dados de cada produto
        String[] partes = linha.split(",\\s*");

        // TODO: Implemente loop para percorrer a lista de partes, processando as informações de cada produto:

        String nome = partes[i].trim();
        double preco = Double.parseDouble(partes[i + 1].trim());
        int quantidadeEmEstoque = Integer.parseInt(partes[i + 2].trim());

        // TODO: Adicione o produto na lista:

    }

    // TODO: Crie a lista para armazenar os produtos com mais de 50 unidades em estoque:


    // TODO: Filtre os produtos com mais de 50 unidades em estoque:


    // TODO: Exiba os nomes dos produtos com mais de 50 unidades em estoque:

}
}