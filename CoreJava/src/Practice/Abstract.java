package Practice;

abstract class Users{
    public void userCredentials(){
        //this method will help storing user credential
    }
}

class Credentials extends Users{
    public void userCredentials(){
        System.out.println("Your password... ********");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Users user = new Credentials();
        user.userCredentials();
    }
}
