package Modifies;

class Private{

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}

public class PrivateModifier {
    public static void main(String[] args) {
        Private obj = new Private();
        obj.setName("Kunal");
        System.out.println(obj.getName());
    }
}
