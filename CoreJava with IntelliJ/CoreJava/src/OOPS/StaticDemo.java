package OOPS;

class TestStatic{

    static int a = 10;
    int b = 20;

    static int count = 0;

    TestStatic(){
        count++;
    }

    static void counter(){
        System.out.println(count);
    }

}

public class StaticDemo {
    public static void main(String[] args) {
        TestStatic obj1 = new TestStatic();
        TestStatic obj2 = new TestStatic();
        TestStatic obj3 = new TestStatic();
        TestStatic obj4 = new TestStatic();

        System.out.println("Accessing static variable and trying to change the value!");
        obj1.a = 100;
        obj2.a = 200;
        obj3.a = 300;
        System.out.println(obj1.a);
        System.out.println(obj2.a);
        System.out.println(obj3.a);
        System.out.println();

        System.out.println("Accessing non-static variable and trying to change the value!");
        obj1.b = 400;
        obj2.b = 500;
        obj3.b = 600;
        System.out.println(obj1.b);
        System.out.println(obj2.b);
        System.out.println(obj3.b);

        TestStatic.counter();

    }
}

//❤️>kkm

/*

static variable vs non-static variable

1. static variable can be used in static as well as non-static methods

2. non-static variable cannot be used in static methods

3. static variable can be accessed through objects, but best practice is to access it through direct class name

    Reason:-
        static int a = 10;

        if we create multiple objects like obj1, obj2, obj3 and try to access and change the value of variable

        example:
            obj1.a = 100;
            obj2.a = 200;
            obj3.a = 300;

        Now, if we print the values of each objects with variable a
        print(obj1.a) ---> which is 100
        print(obj2.b) ---> which is 200
        print(obj3.b) ---> which is 300

        Output will be:
        300
        300
        300

4. For this reason creating object of a class for static variable will only create extra memory and will not change the value and it will not make sense of creating object to access static variable

    example: if class name is DemoStatic
    Accessing the static value will looks like:
        DemoStatic.b = 100;

5. Now, non-static variable or instance variable accessing this will need object and can be also work with class name but best practice is to access them using objects

6. if wee take same above example same as static example,

    int b = 10;
    obj1.b = 100;
    obj2.b = 200;
    obj3.b = 300;

    print(obj1.b) // which is 100
    print(obj2.b) // which is 200
    print(obj3.b) // which is 300

    output:
    100
    200
    300

7. Because it will not make changes on different objects

conclusion:

As name suggest static will be static for all objects and non-static will behave like non-static and will not change values of other objects



*/
