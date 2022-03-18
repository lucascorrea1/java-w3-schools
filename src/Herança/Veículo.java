package Herança;

// É possível herdar atributos e métodos de uma classe para outra.]
// subclasse (filho) - a classe que herda de outra classe
// superclasse (pai) - a classe que está sendo herdada
// Para herdar de uma classe, use a palavra chave 'extends'.

public class Veículo {
    protected String marca = "Ford";
    public void ronco(){
        System.out.println("Vrum, vrum!");
    }
}

class Carro extends Veículo {
    private String modelo = "Ford Ka"; // Atributo de Carro

    public static void main(String[] args) {
        Carro meuCarro = new Carro();  // Cria o objeto meuCarro
        meuCarro.ronco();  // Chama o método da classe Veículo no objeto

        // Exibe o valor do atributo 'marca' (da classe Vehicle) e a 'modelo' da classe Carro.
        System.out.println(meuCarro.marca + " " + meuCarro.modelo);
    }
}
