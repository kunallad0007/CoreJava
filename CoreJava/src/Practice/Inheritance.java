package Practice;

class Parent{

    public void fatherProperty(){
        System.out.println("Father Has 4 Property!");
    }

}

class Child extends Parent{

    public void sonProperty(){
        System.out.println("Son has no property, but he have his father");
    }

    public void fatherProperty(){
        System.out.println("Now, father's properties are mine");
    }

}

public class Inheritance {

    public static void main(String[] args) {

        Parent father = new Parent();
        Child son = new Child();
        System.out.println("Father's Propertied: ");
        father.fatherProperty();

        System.out.println("Son's Properties: ");
        son.sonProperty();
        son.fatherProperty();

    }

}
