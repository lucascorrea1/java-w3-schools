package MetodosDeClasse;

//  Estático vs Não Estático
//  static = ele pode ser acessado sem criar um objeto da classe
//  public = só pode ser acessado por objetos

public class Main {
    //  Método Estático
    static void myMethod(){
        System.out.println("Static methods can be called without creating objects");
    }

    //  Método Público
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        myMethod();
        // myPublicMethod();  Isso irá gerar um erro de compilação
        Main myObj = new Main();
        myObj.myPublicMethod();
    }
}


