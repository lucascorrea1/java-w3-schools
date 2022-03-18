package Enums;

public class EnumEmSwtich {

    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {

        Level myLevel = Level.HIGH;

        switch (myLevel){
            case LOW:
                System.out.println("Sou um noob! :(");
                break;
            case MEDIUM:
                System.out.println("Sou mediano :/");
                break;
            case HIGH:
                System.out.println("Eu sou hokage!");
                break;
        }
    }

}
