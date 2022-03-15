public class DataTypes {
    public static void main(String[] args) {

        //The byte data type can store whole numbers from -128 to 127.
        byte myNumByte = 100;
        System.out.println(myNumByte);

        //The short data type can store whole numbers from -32768 to 32767:
        short myNumShort = 5000;
        System.out.println(myNumShort);

        //The int data type can store whole numbers from -2147483648 to 2147483647.
        int myNumInt = 100000;
        System.out.println(myNumInt);

        //The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807.
        // Note that you should end the value with an "L"
        long myNumLong = 15000000000L;
        System.out.println(myNumLong);

        //The float data type can store fractional numbers from 3.4e−038 to 3.4e+038.
        // Note that you should end the value with an "f":
        float myNumFloat = 5.75f;
        System.out.println(myNumFloat);

        //The double data type can store fractional numbers from 1.7e−308 to 1.7e+308.
        // Note that you should end the value with a "d":
        double myNumDouble = 19.99d;
        System.out.println(myNumDouble);

        //A floating point number can also be a scientific number with an "e" to indicate the power of 10:
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

        //A boolean data type is declared with the boolean keyword and can only take the values true or false:
        //Boolean values are mostly used for conditional testing, which you will learn more about in a later chapter.
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false

        //The char data type is used to store a single character.
        // The character must be surrounded by single quotes, like 'A' or 'c':
        char myGrade = 'B';
        System.out.println(myGrade);

        //The String data type is used to store a sequence of characters (text).
        // String values must be surrounded by double quotes:
        String greeting = "Hello World";
        System.out.println(greeting);

    }
}
