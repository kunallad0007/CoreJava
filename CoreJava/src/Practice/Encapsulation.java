package Practice;
import JavaBasics.GetInput;
class User{
    private String userName;
    //public String testName;

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return userName;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        GetInput newInput = new GetInput();
        User user = new User();
        String userName = newInput.getString();
        user.setUserName(userName);
        System.out.println(user.getUserName());
        //System.out.println(user.testName = "Test Name");

    }
}
