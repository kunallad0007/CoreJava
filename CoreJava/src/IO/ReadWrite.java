package IO;

import java.io.*;
import java.util.Scanner;

class UserInputs{
    private String userName, userAge, userLanguage;
    Scanner input = new Scanner(System.in);
    public void setInput(){
        System.out.print("Enter your name: ");
        this.userName  = input.nextLine();

        System.out.print("Enter your age: ");
        this.userAge = input.nextLine();

        System.out.print("Enter your language: ");
        this.userLanguage = input.nextLine();
    }

    public String getUserName(){
        return userName;
    }

    public String getUserAge(){
        return userAge;
    }

    public String getUserLanguage(){
        return userLanguage;
    }

}

class UserProfileFile extends UserInputs{

    final String fileName = "E:\\CoreJava\\CoreJava\\src\\IO\\user_profile.txt";

    public void writeToFile(){
        String userName="", userAge="", userLanguage="";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            setInput();
            writer.write("Name: " + getUserName());
            writer.newLine();
            writer.write("Age: " + getUserAge());
            writer.newLine();
            writer.write("Language: " + getUserLanguage());
            System.out.println("✅ Data written to file successfully.");
        }catch (Exception e){
            System.out.println("❌ Error writing to file: " + e.getMessage());
        }
        System.out.println("\n🔁 Reading from file:\n");
    }

    public void readFile(){
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
           String line;
           while((line = reader.readLine()) != null){
               System.out.println("\uD83D\uDCC4 " + line);
           }
        }catch (IOException e){
            System.out.println("❌ Error reading the file: " + e.getMessage());
        }
    }

}

public class ReadWrite {
    public static void main(String[] args) {
        UserProfileFile newUser = new UserProfileFile();
        newUser.writeToFile();
        newUser.readFile();
    }
}
