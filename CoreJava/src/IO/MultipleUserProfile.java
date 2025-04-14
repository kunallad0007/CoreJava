package IO;

import java.io.*;
import java.util.Scanner;


class UserInput{
    private String userName, userAge, userLanguage;
    Scanner input = new Scanner(System.in);
    public void setUserInput(){
        System.out.print("Enter Name: ");
        this.userName = input.nextLine();

        System.out.print("Enter Age: ");
        this.userAge = input.nextLine();

        System.out.print("Enter Language: ");
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

class UserProfiles extends UserInput{
    String location = "E:\\CoreJava\\CoreJava\\src\\IO\\multiple_user_profiles.txt";

    public void writeToFile(){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(location, true))){
            setUserInput();
            writer.write("Name: " + getUserName());
            writer.newLine();
            writer.write("Age: " + getUserAge());
            writer.newLine();
            writer.write("Language" + getUserLanguage());
            writer.newLine();
            writer.write("-----------------------------");
            writer.newLine();
            System.out.println("✅ User profile saved.");
        }catch(Exception e){
            System.out.println("❌ Error writing to file: " + e.getMessage());
        }
    }

    public void readFile(){

        File file = new File(location);

        if(!file.exists() || file.length() == 0){
            System.out.println("\n📭 No user profiles found yet. Please add a user first.");
            return;
        }

        System.out.println("\n🔁 All Saved User Profiles:\n");
        try (BufferedReader reader = new BufferedReader(new FileReader(location))) {
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch (Exception e){
            System.out.println("❌ Error reading the file: " + e.getMessage());
        }
    }
}


public class MultipleUserProfile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserProfiles registerProfile = new UserProfiles();
        String yesOrNo;
        String choice;

        do{
            System.out.println("\n👉 MENU:");
            System.out.println("Type 'add' to add user" );
            System.out.println("Type 'show' to display users");
            System.out.println("Type 'exit' to exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextLine().toLowerCase();
            switch (choice){
                case "add":
                    do{
                        registerProfile.writeToFile();
                        System.out.print("\nDo you want to enter another user? (yes/no): ");
                        yesOrNo = sc.nextLine().toLowerCase();
                    }while(yesOrNo.equals("yes"));
                    break;

                case "show":
                    registerProfile.readFile();
                    break;

                case "exit":
                    System.out.println("👋 Bye... See you later 😊");
                    break;

                default:
                    System.out.println("❌ Invalid choice. Try again.");
            }
        }while(!(choice.equals("exit")));
    }
}
