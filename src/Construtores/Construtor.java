package Construtores;

/*
O nome do construtor deve corresponder ao nome da classe e não pode ter um tipo de retorno (como void).
Ele é chamado quando o objeto é criado.
Todas as classes têm construtores por padrão
* */

public class Construtor {
    int x;

    //  Construtor
    public Construtor(){
        x = 5; //  Define o valor inicial para o atributo 'x' da classe
    }

    public static void main(String[] args) {
        Construtor myObj = new Construtor(); //  Cria um objeto da classe Main
        System.out.println(myObj.x); //  Imprime o valor de x;
    }

}


