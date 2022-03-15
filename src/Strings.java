public class Strings {
    public static void main(String[] args) {

        //A String variable contains a collection of characters surrounded by double quotes:
        String greeting = "Hello";
        System.out.println(greeting);

        //String Length
        //A String in Java is actually an object, which contain methods that can perform certain operations on strings.
        //For example, the length of a string can be found with the length() method:
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());


        //Finding a Character in a String
        //The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string
        // (including whitespace):
        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate")); // Outputs 7


        //String Concatenation
        //The + operator can be used between strings to combine them. This is called concatenation:
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        //You can also use the concat() method to concatenate two strings:
        String firstName2 = "John ";
        String lastName2 = "Doe";
        System.out.println(firstName2.concat(lastName2));


    }
}
