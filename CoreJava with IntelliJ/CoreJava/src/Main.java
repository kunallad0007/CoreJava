import JavaClasses.SwitchStatement;
import JavaClasses.GetInput;
import JavaClasses.NewArrayClass;
public class Main {
    public static void main(String[] args) {

        GetInput newInput = new GetInput();


        //Using NewArrayClass and defineArray() from JavaClasses Package
        NewArrayClass newArray = new NewArrayClass();
        System.out.print("Enter the size of array: ");
        int n = newInput.getInt();
        System.out.print("Enter numbers to store in an array: ");
        int[] arr = newArray.defineArray(n);
        newArray.printArray(arr);

        /*
        //SwitchStatement newSwitch = new SwitchStatement();
        //Check Vowel Code
        char ch = newInput.getChar("Enter any character: ");
        newSwitch.checkVowels(ch);
        */
    }
}