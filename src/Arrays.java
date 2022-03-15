public class Arrays {
    //Arrays are used to store multiple values in a single variable,
    //instead of declaring separate variables for each value.
    //To declare an array, define the variable type with square brackets:

    public static void main(String[] args) {
        //We have now declared a variable that holds an array of strings.
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        //To create an array of integers, you could write:
        int[] myNum = {10, 20, 30, 40};

        //You access an array element by referring to the index number.
        System.out.println(cars[0]);
        // Outputs Volvo

        //To change the value of a specific element, refer to the index number:
        cars[0] = "Opel";
        System.out.println(cars[0]);
        // Now outputs Opel instead of Volvo

        //To find out how many elements an array has, use the length property:
        System.out.println(cars.length);
        // Outputs 4

        //Loop Through an Array
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        //Loop Through an Array with For-Each
        for (String i : cars) {
            System.out.println(i);
        }
        //The example above can be read like this: for each String element (called i - as in index)
        // in cars, print out the value of i.




    }
}
