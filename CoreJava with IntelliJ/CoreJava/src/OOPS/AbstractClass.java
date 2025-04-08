package OOPS;
/*
It basically means we connected create constructor of an abstract class
like the code below:
*/
abstract class Car{
    public void drive(){}
}

class Ferrari extends Car{
    public void drive() {
        System.out.println("Driving Ferrari 🔥");
    }
}

public class AbstractClass {

    public static void main(String[] args) {
        //we cannot create an object of the abstract class directly
        //example:
        Car ferrariCar = new Ferrari(); // ✅ Upcasting: Car reference, Ferrari object
        ferrariCar.drive(); // Calls Ferrari's overridden method

    }
}
