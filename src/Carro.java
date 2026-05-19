// Nome: Sami Daniel Santos Silva
// Matricula: 1261950200

public class Carro {
    public String marca;
    public String modelo;
    public int ano;
    public double velocidadeAtual;

    public Carro() {
        this.velocidadeAtual = 0.0;
    }

    public void acelerar(double valor) {
        if (valor <= 0) return;
        this.velocidadeAtual += valor;
    }

    public void frear(double valor) {
        if (valor <= 0) return;
        this.velocidadeAtual -= valor;
        if (this.velocidadeAtual < 0) this.velocidadeAtual = 0.0;
    }

    public void exibirDados() {
        System.out.printf("Marca: %s | Modelo: %s | Ano: %d | Velocidade: %.1f km/h%n",
                marca, modelo, ano, velocidadeAtual);
    }
}
