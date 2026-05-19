// Nome: Sami Daniel Santos Silva
// Matricula: 1261950200

public class Pedido {
    public int numeroPedido;
    public String nomeCliente;
    public Hamburguer item1;
    public Hamburguer item2;
    public boolean pago;

    public Pedido() {
        this.pago = false;
    }

    public double calcularTotal() {
        double total = 0.0;
        if (item1 != null) total += item1.preco;
        if (item2 != null) total += item2.preco;
        return total;
    }

    public void pagar() {
        this.pago = true;
    }

    public void exibirPedido() {
        System.out.println("====== PEDIDO #" + numeroPedido + " ======");
        System.out.println("Cliente: " + nomeCliente);
        if (item1 != null) {
            System.out.printf("Item 1: %s — R$ %.2f%n", item1.nome, item1.preco);
        }
        if (item2 != null) {
            System.out.printf("Item 2: %s — R$ %.2f%n", item2.nome, item2.preco);
        }
        System.out.printf("Total: R$ %.2f%n", calcularTotal());
        System.out.println("Status: " + (pago ? "PAGO" : "PENDENTE"));
    }
}
