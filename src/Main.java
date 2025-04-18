public class Main {
    public static void main(String[] args) {

        Produtos produto1 = new Produtos();
        produto1.nome = "Teclado";
        produto1.preco = 29.99;
        produto1.quantidade = 10;

        Produtos produto2 = new Produtos();
        produto2.nome = "Mouse";
        produto2.preco = 19.99;
        produto2.quantidade = 12;

        produto1.exibirDetalhes();
        produto1.calcularTotal();
        System.out.println(" ");
        produto2.exibirDetalhes();
        produto2.calcularTotal();
    }
}
