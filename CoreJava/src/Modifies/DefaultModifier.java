package Modifies;

class Default{

    String yourName;

    String getName(String name){
        yourName = name;
        return yourName;
    }

    void displayName(){
        System.out.println(getName(yourName));
    }

}

public class DefaultModifier {
    public static void main(String[] args) {
        Default obj = new Default();
        obj.getName("Kunal");
        obj.displayName();
    }
}
