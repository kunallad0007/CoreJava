package OOPS;

import javax.xml.crypto.dsig.keyinfo.KeyName;

public class MethodOverriding {
    public static void main(String[] args) {
        Kunal age1 = new Rahul();
        Kunal age2 = new Karan();

        age1.age();
        age2.age();
    }
}

class Kunal{

    public void age(){
        System.out.println("Kunal age is 25");
    }

}

class Rahul extends Kunal{

    public void age(){
        System.out.println("Rahul age is 15");
    }

}

class Karan extends Kunal {

    public void age(){
        System.out.println("Karan age is 34");
    }

}
