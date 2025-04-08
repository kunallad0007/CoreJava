package OOPS;

class A_Class{

    public void printA(){
        System.out.println("Print A Method Called successfully!");
    }
}

class B_Class{

    A_Class a;

    public void printB(){
        a.printA();
    }

    B_Class(A_Class a){
        this.a = a;
    }

}

public class PracticeConstructor {
    public static void main(String[] args) {
        A_Class a = new A_Class();
        B_Class b = new B_Class(a);
        b.printB();
    }
}
