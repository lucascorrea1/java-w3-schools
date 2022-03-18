package Abstração;

/*
* Assim como as classes abstratas , as interfaces não podem ser usadas para criar objetos
* Métodos de interface não possuem corpo - o corpo é fornecido pela classe "implement"
* Na implementação de uma interface, você deve substituir todos os seus métodos
* Os métodos de interface são por padrão abstracte public
* Os atributos de interface são por padrão publice static e final
* Uma interface não pode conter um construtor (já que não pode ser usada para criar objetos)
* */


public class InterfaceAnimal {
    interface Animal{
        void animalSound(); // não tem um corpo
        void sleep(); // não tem um corpo
    }

    // Subclasse (herdada de Animal)
    class Pig implements Animal {
        public void animalSound() {
            // O corpo do método animalSound() está aqui
            System.out.println("O pig faz: wee wee");
        }

        @Override
        public void sleep() {
            System.out.println("ZzzZzzZZzz");
        }
    }

    class Main {
        public void main(String[] args) {
            Abstração.Pig myPig = new Abstração.Pig(); // Cria um objeto Pig
            myPig.animalSound();
            myPig.sleep();
        }
    }

}
