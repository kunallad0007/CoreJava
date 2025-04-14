package ExceptionHandling;

public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        try{
            int a = 20, b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        }catch (Exception e){
            System.out.println("Error: Cannot Divide by zero.");
        }
        System.out.println("Exception Handled 😊");
    }
}
