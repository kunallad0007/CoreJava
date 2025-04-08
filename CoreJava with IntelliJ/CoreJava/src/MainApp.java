import JavaBasics.GetInput;
import JavaBasics.IfElse;
public class MainApp {
    public static void main(String[] args) {

        GetInput newInput = new GetInput();//creating object

        //Using IfElse and checkDrivingAge() from JavaClasses Package
        IfElse newIfElse = new IfElse();
        int n = newInput.getInt();
        newIfElse.checkDrivingAge(n);

        /* To use the below code just uncomment the section
        //Using NewArrayClass and defineArray() from JavaClasses Package
        NewArrayClass newArray = new NewArrayClass(); //creating object
        System.out.print("Enter the size of array: ");
        int n = newInput.getInt();
        System.out.print("Enter numbers to store in an array: ");
        int[] arr = newArray.defineArray(n);
        newArray.printArray(arr);
        */

        /*To use the below code just uncomment the section
        //SwitchStatement newSwitch = new SwitchStatement();
        //Check Vowel Code
        char ch = newInput.getChar("Enter any character: ");
        newSwitch.checkVowels(ch);
        */

        newInput.closeInput();
    }
}