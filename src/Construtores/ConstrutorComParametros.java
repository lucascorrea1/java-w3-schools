package Construtores;

public class ConstrutorComParametros {
    int x;

    public ConstrutorComParametros(int y) {
        this.x = y;
    }

    public static void main(String[] args) {
        ConstrutorComParametros meuObjeto = new ConstrutorComParametros(10);
        System.out.println(meuObjeto.x);
    }
}
