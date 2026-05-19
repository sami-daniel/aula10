// Nome: Sami Daniel Santos Silva
// Matricula: 1261950200

public class TestaPet {
    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.nome = "Rex";
        pet.especie = "cachorro";
        pet.raca = "Labrador";
        pet.idade = 3;
        pet.peso = 28.5;
        pet.apresentar();
        pet.avaliarPeso(30.0);
    }
}
