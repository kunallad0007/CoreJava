package Modifies;
import java.util.Scanner;

class Protected{

    final Scanner sc = new Scanner(System.in);

    protected String name;

    protected void inputName(){
        name = sc.nextLine();
    }

    protected void display(){
        System.out.println(name);
    }

}

class ProtectedChild extends Protected {

}

public class ProtectModifier {
    public static void main(String[] args) {
        ProtectedChild obj = new ProtectedChild();
        obj.inputName();
        obj.display();
    }
}
