public class ParametersAndArguments {

    static void myMethod(String fname){
        System.out.println(fname + " Refsnes");
    }

    //Multiple Parameters
    static void myMethod2(String fname2, int age) {
        System.out.println(fname2 + " is " + age);
    }

    static int myMethod3(int x) {
        return 5 + x;
    }

    static int myMethod4(int x, int y) {
        return x + y;
    }

    static void checkAge(int age){
        if (age < 18){
            System.out.println("Access denied - You are not old enough!");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");

        myMethod2("Liam", 5);
        myMethod2("Jenny", 8);
        myMethod2("Anja", 31);

        System.out.println(myMethod3(3));
        //Outputs 8 (5 + 3)

        System.out.println(myMethod4(5, 3));
        //Outputs 8 (5 + 3)

        int z = myMethod4(5,3);
        System.out.println(z);
        //Outputs 8 (5 + 3)

        checkAge(20);
        //Outputs "Access granted - You are old enough!"
    }
    /*
    * Information can be passed to methods as parameter. Parameters act as variables inside the method.
    Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want,
    * just separate them with a comma.
    */

    //Return Values
     /*
     * The void keyword, used in the examples above, indicates that the method should not return a value.
     * If you want the method to return a value, you can use a primitive data type
     * (such as int, char, etc.) instead of void, and use the return keyword inside the method
     * */

}
