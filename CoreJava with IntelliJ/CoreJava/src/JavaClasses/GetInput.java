package JavaClasses;
import java.util.Scanner;
public class GetInput {
    Scanner sc = new Scanner(System.in);

    public int getInt(){
        return sc.nextInt();
    }

    public char getChar(){
        return sc.next().charAt(0);
    }

    public void closeInput(){
        sc.close();
    }
}
