package UserInput;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Pede os dados
        System.out.println("Insira nome, idade e salário: ");

        // Lê os dados
        String nome = scan.next();
        int idade = scan.nextInt();
        double salario = scan.nextDouble();

        // Imprime os dados
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);

    }
}
