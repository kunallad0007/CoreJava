import JavaClasses.SwitchStatement;
import JavaClasses.GetInput;
import JavaClasses.NewArrayClass;
public class Main {
    public static void main(String[] args) {
        SwitchStatement newSwitch = new SwitchStatement();
        GetInput newInput = new GetInput();
        NewArrayClass newArray = new NewArrayClass();

        //Define Array Code
        System.out.print("Enter the size of array: ");
        int n = newInput.getInt();
//        System.out.println();
        System.out.print("Enter numbers to store in an array: ");
        int[] arr = newArray.defineArray(n);
//        System.out.println();
        newArray.printArray(arr);

        //Check Vowel Code
        /*
        char ch = newInput.getChar("Enter any character: ");
        newSwitch.checkVowels(ch);
         */
    }
}