package JavaClasses;

public class SwitchStatement {
    public void checkVowels(char ch){
        switch (ch){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("It is a Vowel!");
                break;
            default:
                System.out.println("It is not a Vowel!");
        }
    }
}
