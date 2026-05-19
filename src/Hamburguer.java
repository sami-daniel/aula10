// Nome: Sami Daniel Santos Silva
// Matricula: 1261950200

public class Hamburguer {
    public String nome;
    public String descricao;
    public double preco;

    public Hamburguer() {
    }

    public void exibir() {
        System.out.printf("%s — R$ %.2f%n", nome, preco);
        System.out.println(descricao);
    }
}
