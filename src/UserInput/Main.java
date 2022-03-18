package UserInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Cria o objeto scan

        System.out.println("Insira um nome de usuário: ");
        String userName = scan.nextLine();  // Lê a entrada do usuário e guarda na variável

        System.out.println("O nome do usuário é:"+ userName); // Imprime.
    }
}
