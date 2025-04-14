package ExceptionHandling;

public class Finally {
    public static void main(String[] args) {
        try{
            int a = 5/0;
            System.out.println(a);
        }catch(ArithmeticException e){
            System.out.println("Error: Can't divide by zro");
        }finally {
            System.out.println("This runs no matter what!");
        }
    }
}
