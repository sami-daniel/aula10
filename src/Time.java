// Nome: Sami Daniel Santos Silva
// Matricula: 1261950200

public class Time {
    public String nome;
    public String cidade;
    public int titulos;
    public Jogador artilheiro;
    public Jogador goleiro;

    public Time() {
    }

    public void apresentarTime() {
        System.out.printf("%s — %s | Títulos: %d%n", nome, cidade, titulos);
    }

    public void exibirDestaques() {
        if (artilheiro != null) {
            System.out.print("Artilheiro: ");
            artilheiro.exibirJogador();
        }
        if (goleiro != null) {
            System.out.print("Goleiro: ");
            goleiro.exibirJogador();
        }
    }

    public void ganharTitulo(String nomeTitulo) {
        titulos++;
        System.out.printf("%s conquistou a %s! Agora com %d títulos!%n", nome, nomeTitulo, titulos);
    }
}
