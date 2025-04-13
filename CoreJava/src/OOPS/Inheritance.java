package OOPS;

public class Inheritance {

    public static void main(String[] args) {

        Car1 car1 = new Car1();
        car1.horn();
        Car2 car2 = new Car2();
        car2.speed();

        // Implementing car2 methods in car1 methods
        car1 = new Car2();
        car1.horn();
        car1.speed();

    }

}

class Car1{

    public void horn(){
        System.out.println("Car1 Horn Pressed!");
    }

    public void speed(){
        System.out.println("Car2 Accelerator Pressed!");
    }

}

class Car2 extends Car1{//When you use extend keyword you are inheriting the parent class and use the methods, in etc things in the child class

    public void horn(){
        System.out.println("Car2 Horn Pressed");
    }

    public void speed(){
        System.out.println("Car2 Accelerator Pressed!");
    }

}




