package Enums;

// Também é possível ter um enum dentro de uma classe
// Um enumpode, assim como um class, ter atributos e métodos.
// A única diferença é que as constantes enum são public, statice final (imutáveis - não podem ser substituídas).
// Não pode ser usado para criar objetos e não pode estender outras classes (mas pode implementar interfaces).
// Use enums quando tiver valores que você sabe que não vão mudar, como dias do mês, dias, cores, baralho de cartas etc.

public class Main {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myLevel = Level.HIGH;
        System.out.println("Meu nível é: " + myLevel);
    }

}
