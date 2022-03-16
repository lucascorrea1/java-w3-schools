public class WhileLoop {

    public static void main(String[] args) {

        // Se uma condição especificada for alcançada o loop pode executar um bloco de código.
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        //  Executará o bloco de código uma vez, antes mesmo de verificar se a condição é verdadeira,
        //  Então ele irá continuar o loop enquanto a condição for verdadeira
        int x = 0;
        do {
            System.out.println(i);
            x++;
        }
        while (x < 5);
    }

}
