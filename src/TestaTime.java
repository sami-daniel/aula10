// Nome: Sami Daniel Santos Silva
// Matricula: 1261950200

public class TestaTime {
    public static void main(String[] args) {
        Jogador atacante = new Jogador();
        atacante.nome = "Pedro Henrique";
        atacante.posicao = "Atacante";
        atacante.numeroCamisa = 9;
        atacante.gols = 12;

        Jogador goleiro = new Jogador();
        goleiro.nome = "Douglas Costa";
        goleiro.posicao = "Goleiro";
        goleiro.numeroCamisa = 1;
        goleiro.gols = 0;

        Time time = new Time();
        time.nome = "Atlético Mineiro";
        time.cidade = "Belo Horizonte";
        time.titulos = 47;
        time.artilheiro = atacante;
        time.goleiro = goleiro;

        time.apresentarTime();
        time.exibirDestaques();
        atacante.marcarGol();
        time.ganharTitulo("Copa do Brasil 2026");
    }
}
