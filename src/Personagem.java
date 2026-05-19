// Nome: Sami Daniel Santos Silva
// Matricula: 1261950200

public class Personagem {
    public String nome;
    public String classe;
    public int nivel;
    public int pontosDeVida;
    public int pontosDeVidaMaximos;
    public int ataque;
    public int defesa;

    public Personagem() {
    }

    public void atacar(Personagem alvo) {
        int dano = this.ataque - alvo.defesa;
        if (dano < 1) dano = 1;
        alvo.receberDano(dano);
    }

    public void receberDano(int dano) {
        if (dano <= 0) return;
        pontosDeVida -= dano;
        if (pontosDeVida < 0) pontosDeVida = 0;
    }

    public void curar(int valor) {
        if (valor <= 0) return;
        pontosDeVida += valor;
        if (pontosDeVida > pontosDeVidaMaximos) pontosDeVida = pontosDeVidaMaximos;
    }

    public boolean estaVivo() {
        return pontosDeVida > 0;
    }

    public void subirNivel() {
        nivel++;
        ataque += 5;
        defesa += 3;
        pontosDeVidaMaximos += 20;
        pontosDeVida = pontosDeVidaMaximos;
    }

    public void exibirStatus() {
        System.out.printf("[%s - %s Nv.%d] HP: %d/%d | ATK: %d | DEF: %d%n",
                nome, classe, nivel, pontosDeVida, pontosDeVidaMaximos, ataque, defesa);
    }
}
