package ClassesJava;

public class Second {
    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);

        //  É possível alterar os valores de atributo de um objeto, sem afetar os atributos de outro.
    }
}
