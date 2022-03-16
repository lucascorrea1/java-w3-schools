public class TypeCasting {
    public static void main(String[] args) {
        //  Widening Casting
        //  Ocorre quando passamos um tipo de tamanho menor para um tipo de tamanho maior
        int myInt = 9;
        double myDouble = myInt; //  transforma int em double

        System.out.println(myInt);      //  Saída: 9
        System.out.println(myDouble);   //  Saída: 9.0

        //  Narrowing Casting
        //  Feito colocando o tipo entre parênteses na frente do valor
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; //  Transforma double em int

        System.out.println(myDouble2);   //  Saída: 9.78
        System.out.println(myInt2);      //  Saída: 9

    }
}
