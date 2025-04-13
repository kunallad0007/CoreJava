class TestStatic{

    static int a = 10;
    int b = 20;

    public void display(){
        System.out.println("Static variable a: " + a);
        System.out.println("Non-static variable b: " + b);
    }

}

public class Static{

    public static void main(String[] args) {
        
        TestStatic obj = new TestStatic();
        TestStatic obj1 = new TestStatic();
        obj.display(); // Accessing both static and non-static variables through an object
        System.out.println("Static variable a: " + TestStatic.a); // Accessing static variable directly using class name
        System.out.println("Non-static variable b: " + obj.b); // Accessing non-static variable through object

        obj.a = 30;
        System.out.println("Updated static variable a: " + obj.a); // Accessing updated static variable through object
        obj1.a = 200;
        System.out.println("Updated static variable a: " + obj1.a); // Accessing updated static variable directly using class name

        obj.b = 200;
        System.out.println("Updated non-static variable b: " + obj.b); // Accessing updated non-static variable through object
        obj1.b = 300;
        System.out.println("Updated non-static variable b: " + obj1.b); // Accessing updated non-static variable through object

    }

}