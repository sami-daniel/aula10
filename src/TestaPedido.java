// Nome: Sami Daniel Santos Silva
// Matricula: 1261950200

public class TestaPedido {
    public static void main(String[] args) {
        Hamburguer smashClassico = new Hamburguer();
        smashClassico.nome = "Smash Clássico";
        smashClassico.descricao = "Pão brioche, smash, queijo, alface, tomate";
        smashClassico.preco = 28.90;

        Hamburguer vegano = new Hamburguer();
        vegano.nome = "Green Byte";
        vegano.descricao = "Pão integral, burger de grão-de-bico, rúcula";
        vegano.preco = 32.50;

        Pedido pedido = new Pedido();
        pedido.numeroPedido = 42;
        pedido.nomeCliente = "Ana Lima";
        pedido.item1 = smashClassico;
        pedido.item2 = vegano;
        pedido.exibirPedido();
        pedido.pagar();
    }
}
