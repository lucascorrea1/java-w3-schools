public class MultidimensionalArrays {
    //A multidimensional array is an array of arrays.
    //To create a two-dimensional array, add each array within its own set of curly braces:

    public static void main(String[] args) {
        //                        0         1
        //                     0 1 2 3    0 1 2
        int[][] myNumbers = { {1,2,3,4}, {5,6,7} };
        //myNumbers is now an array with two arrays as its elements.
        //Para acessar os elementos da matriz myNumbers , especifique dois índices: um para a matriz e outro para
        // o elemento dentro dessa matriz. Este exemplo acessa o terceiro elemento (2) no segundo array (1) de myNumbers
        int x = myNumbers[1][2];
        System.out.println("Terceiro elemento (2) no segundo array (1): "+x); // Outputs 7

        //We can also use a for loop inside another for loop to get the elements of a two-dimensional array
        // (we still have to point to the two indexes):
        int[][] myNumbers2 = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers2.length; ++i) {
            for(int j = 0; j < myNumbers2[i].length; ++j) {
                System.out.println(myNumbers2[i][j]);
            }
        }
    }
}
