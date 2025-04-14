package ExceptionHandling;

public class Throw {
    public static void main(String[] args) {
        int age = 15;
        if(age < 18){
            throw new ArithmeticException("Age must be 18+");
        }else{
            System.out.println("You can vote");
        }
    }
}
