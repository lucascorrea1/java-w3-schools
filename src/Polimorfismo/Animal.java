package Polimorfismo;

class Animal {
    public void animalSound() {
        System.out.println("O animal faz o som");
    }
}

class Porco extends Animal {
    public void animalSound() {
        System.out.println("O porco faz: wee wee");
    }
}

class Cachorro extends Animal {
    public void animalSound() {
        System.out.println("O cachorro faz: au au");
    }
}

class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Porco();
        Animal myDog = new Cachorro();
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}