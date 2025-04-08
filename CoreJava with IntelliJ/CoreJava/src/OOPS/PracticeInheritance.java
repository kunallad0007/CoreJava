package OOPS;

public class PracticeInheritance {
    public static void main(String[] args) {
        Son son = new Son();
        son.grandFatherProperty();
        son.fatherProperty();
        son.sonProperty();
    }
}

class GrandFather{

    public void grandFatherProperty(){
        System.out.println("3000 Sq ft");
    }

}

class Father extends GrandFather{

    public void fatherProperty(){
        System.out.println("30000 Sq ft");
    }

}

class Son extends Father{

    public void sonProperty(){
        System.out.println("I'm having the property! 😁");
    }

}
