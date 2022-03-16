public class Variaveis {
    public static void main(String[] args) {
        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        //  Imprime as variáveis
        System.out.println("My Num: "+myNum);
        System.out.println("My Float Num: "+myFloatNum);
        System.out.println("My Char: "+myLetter);
        System.out.println("My Bool: "+myBool);
        System.out.println("My Text: "+myText);

        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println("My Full Name: "+fullName);

        //  Para declarar mais de uma variável do mesmo tipo, usamos a vírgula.
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);

        //  Todas as variáveis no Java devem ter um nome único.
        //  Bom
        int minutesPerHour = 60;

        //  Funciona, mas não é fácil de entender o que 'm' significa.
        int m = 60;
    }
}
