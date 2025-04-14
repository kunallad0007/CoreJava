package Programs;

import Modifies.Protected;

class Calling extends Protected{
    protected String name = super.name;
    @Override
    protected void inputName() {
        //super.name;
        super.inputName();
    }

    @Override
    protected void display(){
        super.display();
    }
}

public class CallingProtected {
    public static void main(String[] args) {
        Calling obj = new Calling();
        obj.inputName();
        obj.display();
    }
}
