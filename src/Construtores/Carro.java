package Construtores;

public class Carro {
    int anoModelo;
    String nomeModelo;

    public Carro(int ano, String nome){
        anoModelo = ano;
        nomeModelo = nome;
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro(2011, "Ford Ka");
        System.out.println(meuCarro.nomeModelo + " " + meuCarro.anoModelo);
    }
}
