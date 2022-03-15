public class Switch {
    //  The switch expression is evaluated once.
    //  The value of the expression is compared with the values of each case.
    //  If there is a match, the associated block of code is executed.
    //  The break and default keywords are optional

    public static void main(String[] args) {
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
                // Outputs "Thursday" (day 4)
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        //  The break Keyword
        // When Java reaches a break keyword, it breaks out of the switch block.
        // This will stop the execution of more code and case testing inside the block.
        // When a match is found, and the job is done, it's time for a break. There is no need for more testing.


        //  The default Keyword
        // The default keyword specifies some code to run if there is no case match:
        int day2 = 4;
        switch (day2) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
                // Outputs "Looking forward to the Weekend"
        }
    }

}
