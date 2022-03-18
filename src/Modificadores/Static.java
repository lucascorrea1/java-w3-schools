package Modificadores;

public class Static {
    static void myStaticMethod(){
        System.out.println("Métodos estáticos podem ser chamados sem criar objetos");
    }

    public void myPublicmethod(){
        System.out.println("Métodos públicos devem ser chamados criando objetos");
    }

    public static void main(String[] args) {
        myStaticMethod();
        //myPublicMethod(); // Isso geraria um erro, pois não está chamando em um objeto.

        Static meuObjeto = new Static(); // Cria um objeto
        meuObjeto.myPublicmethod(); // Chama o método público no objeto.
    }

}
