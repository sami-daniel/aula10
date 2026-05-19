// Nome: Sami Daniel Santos Silva
// Matricula: 1261950200

public class Produto {
    public String nome;
    public double preco;
    public int quantidadeEstoque;

    public Produto() {
    }

    public void vender(int quantidade) {
        if (quantidade <= 0) return;
        if (quantidade > quantidadeEstoque) {
            System.out.println("Quantidade insuficiente no estoque");
            return;
        }
        quantidadeEstoque -= quantidade;
    }

    public void repor(int quantidade) {
        if (quantidade <= 0) return;
        quantidadeEstoque += quantidade;
    }

    public double calcularValorTotal() {
        return preco * quantidadeEstoque;
    }

    public void exibirInformacoes() {
        System.out.printf("Produto: %s | Preço: R$ %.2f | Estoque: %d unidades%n",
                nome, preco, quantidadeEstoque);
        System.out.printf("Valor total em estoque: R$ %.2f%n", calcularValorTotal());
    }
}
