package ExceptionHandling;

public class NullPointerExceptions {
    public static void main(String[] args) {
        try{
            String str = null;
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("String is Null");
        }
        System.out.println("Exception Handled 😊");
    }
}
