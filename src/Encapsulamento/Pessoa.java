package Encapsulamento;

public class Pessoa {
    private String nome;

    //Getter
    public String getNome() {
        return nome;
    }

    //Setter
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
    // O método pega o parâmetro 'novoNome' e o atribui à variável nome.
    // A palavra 'this' é usada para se referir ao objeto atual

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        System.out.println("Nome: " + pessoa.getNome());
    }
}
