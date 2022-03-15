public class WhileLoop {

    // Loops can execute a block of code as long as a specified condition is reached.
    // Loops are handy because they save time, reduce errors, and they make code more readable.

    public static void main(String[] args) {
        //  While Loop
        // The while loop loops through a block of code as long as a specified condition is true:
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        //  Do/While Loop
        // This loop will execute the code block once, before checking if the condition is true,
        // then it will repeat the loop as long as the condition is true
        int x = 0;
        do {
            System.out.println(i);
            x++;
        }
        while (x < 5);

    }
}
