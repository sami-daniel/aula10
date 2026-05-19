// Nome: Sami Daniel Santos Silva
// Matricula: 1261950200

public class TestaProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Caneta Azul";
        produto.preco = 2.50;
        produto.quantidadeEstoque = 100;
        produto.vender(30);
        produto.exibirInformacoes();
    }
}
