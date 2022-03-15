public class BreakAndContinue {
    //The break statement can also be used to jump out of a loop.
    public static void main(String[] args) {
        //The break statement can also be used to jump out of a loop.
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        //The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues
        // with the next iteration in the loop.
        for (int y = 0; y < 10; y++) {
            if (y == 4) {
                System.out.println("skips the value of 4");
                continue;
            }
            System.out.println(y);
        }

        //You can also use break and continue in while loops:
        int x = 0;
        while (x < 10) {
            System.out.println(x);
            x++;
            if (x == 4) {
                break;
            }
        }

        int z = 0;
        while (z < 10) {
            if (z == 4) {
                z++;
                continue;
            }
            System.out.println(z);
            z++;
        }

    }
}
