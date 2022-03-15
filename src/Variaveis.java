public class Variaveis {
    public static void main(String[] args) {
        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        //  Display Variables
        System.out.println("My Num: "+myNum);
        System.out.println("My Float Num: "+myFloatNum);
        System.out.println("My Char: "+myLetter);
        System.out.println("My Bool: "+myBool);
        System.out.println("My Text: "+myText);

        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println("My Full Name: "+fullName);

        //  To declare more than one variable of the same type, use a comma-separated list:
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);

        //  All Java variables must be identified with unique names.
        // Good
        int minutesPerHour = 60;

        // OK, but not so easy to understand what m actually is
        int m = 60;

        /*
        * The general rules for naming variables are:
            Names can contain letters, digits, underscores, and dollar signs
            Names must begin with a letter
            Names should start with a lowercase letter and it cannot contain whitespace
            Names can also begin with $ and _ (but we will not use it in this tutorial)
            Names are case sensitive ("myVar" and "myvar" are different variables)
            Reserved words (like Java keywords, such as int or boolean) cannot be used as names
        * */
    }
}
