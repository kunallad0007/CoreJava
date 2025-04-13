package Programs;

abstract class Vehicle{

    public abstract void engine();

}

class BMW extends Vehicle{

    public void engine(){
        System.out.println("engine: 4000cc.");
    }

}

public class Abstraction {

    public static void main(String[] args) {
        Vehicle bmw = new BMW();
        bmw.engine();
    }

}
