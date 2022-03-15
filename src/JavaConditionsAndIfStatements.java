public class JavaConditionsAndIfStatements {
    /*
      Less than: a < b
      Less than or equal to: a <= b
      Greater than: a > b
      Greater than or equal to: a >= b
      Equal to a == b
      Not Equal to: a != b
      * */

    public static void main(String[] args) {
        //  Java has the following conditional statements:
        //  Use the if statement to specify a block of Java code to be executed if a condition is true
        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }

        //  We can also test variables:
        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        }

        //  The else Statement
        //  Use the else statement to specify a block of code to be executed if the condition is false.
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        } //  Outputs "Good evening."

        //  Use the else if statement to specify a new condition if the first condition is false.
        int time2 = 22;
        if (time2 < 10) {
            System.out.println("Good morning.");
        } else if (time2 < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        } // Outputs "Good evening."

        //There is also a short-hand if else, which is known as the ternary operator because
        // it consists of three operands.
        //  variable = (condition) ? expressionTrue :  expressionFalse;
        int time3 = 20;
        String result = (time3 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);


    }



}
