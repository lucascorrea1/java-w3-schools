package Abstração;

// Classe abstrata: é uma classe restrita que não pode ser usada para criar objetos
// (para acessá-la, ela deve ser herdada de outra classe).

// Método abstrato: só pode ser usado em uma classe abstrata e não possui corpo. O corpo é fornecido pela subclasse.

// Por que e quando usar classes e métodos abstratos?
// Para obter segurança - oculte certos detalhes e mostre apenas os detalhes importantes de um objeto.

// Classe Abstrata
abstract class Animal {
    // Método abstrato (não tem um corpo)
    public abstract void animalSound();
    // Método regular
    public void sleep() {
        System.out.println("ZzZzZzzz");
    }
}

// Subclasse (herdada de Animal)
class Pig extends Animal {
    public void animalSound() {
        // O corpo do método animalSound() está aqui
        System.out.println("O pig faz: wee wee");
    }
}

class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Cria um objeto Pig
        myPig.animalSound();
        myPig.sleep();
    }
}
