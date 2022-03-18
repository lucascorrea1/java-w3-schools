package Modificadores;

public abstract class Abstract {
    public String fname = "John";
    public int idade = 24;
    public abstract void estuda();
}

// Subclass (herda da principal)
class Estudante extends Abstract {
    public int anoDeFormatura = 2022;
    public void estuda() {
        System.out.println("Estudando o dia inteiro");
    }
}

class Executa{
    public static void main(String[] args) {
        // Cria um objeto da classe Estudante (que herda atributos e métodos da classe Abstract)
        Estudante estudante = new Estudante();

        System.out.println("Nome: " + estudante.fname);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Ano de Formatura: " + estudante.anoDeFormatura);
        estudante.estuda();  // Chama o método abstrato.
    }
}
