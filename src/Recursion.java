public class Recursion {
    //Recursion is the technique of making a function call itself. This technique provides a way to break
    // complicated problems down into simple problems which are easier to solve.

    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }

    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out.println(result);
    }

}
