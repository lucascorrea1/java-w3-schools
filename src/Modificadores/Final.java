package Modificadores;

public class Final {
    final int x = 10;
    final double PI = 3.14;

    public static void main(String[] args) {
        Final meuObjeto = new Final();
        //meuObjeto.x = 50;
        //meuObjeto.PI = 25;
        System.out.println(meuObjeto.x);
        System.out.println(meuObjeto.PI);
        // irá gerar um erro:
        // cannot assign a value to a final variable
    }
}
