// Nome: Sami Daniel Santos Silva
// Matricula: 1261950200

public class Pet {
    public String nome;
    public String especie;
    public String raca;
    public int idade;
    public double peso;

    public Pet() {
    }

    public void apresentar() {
        System.out.printf("Olá! Meu nome é %s, sou um %s da raça %s.%n", nome, especie, raca);
        System.out.printf("Tenho %d anos e peso %.1f kg.%n", idade, peso);
    }

    public void aniversario() {
        idade++;
        System.out.printf("%s fez aniversário! Agora tem %d anos.%n", nome, idade);
    }

    public void avaliarPeso(double pesoIdeal) {
        if (peso < pesoIdeal) {
            System.out.printf("%s está abaixo do peso ideal (%.1f kg).%n", nome, pesoIdeal);
        } else if (peso > pesoIdeal) {
            System.out.printf("%s está acima do peso ideal (%.1f kg).%n", nome, pesoIdeal);
        } else {
            System.out.printf("%s está no peso ideal (%.1f kg).%n", nome, pesoIdeal);
        }
    }
}
