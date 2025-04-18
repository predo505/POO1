public class Produtos {

    String nome;
    double preco;
    int quantidade;

    public void exibirDetalhes() {
        System.out.println("Detalhes do produto");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
    }
    public void calcularTotal() {
        System.out.println("Quantidade total em estoque: " + quantidade);
    }
}
