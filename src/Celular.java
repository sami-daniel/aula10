// Nome: Sami Daniel Santos Silva
// Matricula: 1261950200

public class Celular {
    public String marca;
    public String modelo;
    public int bateria;
    public boolean ligado;
    public double armazenamentoUsado;
    public double armazenamentoTotal;

    public Celular() {
    }

    public void ligar() {
        if (bateria > 0) {
            ligado = true;
        } else {
            System.out.println("Bateria vazia. Não é possível ligar.");
        }
    }

    public void desligar() {
        ligado = false;
    }

    public void carregarBateria(int percentual) {
        if (percentual <= 0) return;
        bateria += percentual;
        if (bateria > 100) bateria = 100;
    }

    public void usarArmazenamento(double gb) {
        if (gb <= 0) return;
        if (armazenamentoUsado + gb > armazenamentoTotal) {
            System.out.println("Espaço insuficiente para armazenar " + gb + " GB");
            return;
        }
        armazenamentoUsado += gb;
    }

    public void exibirStatus() {
        String estado = ligado ? "LIGADO" : "DESLIGADO";
        System.out.printf("%s %s — %s%n", marca, modelo, estado);
        System.out.printf("Bateria: %d%%%n", bateria);
        System.out.printf("Armazenamento: %.1f GB / %.1f GB usados%n", armazenamentoUsado, armazenamentoTotal);
    }
}
