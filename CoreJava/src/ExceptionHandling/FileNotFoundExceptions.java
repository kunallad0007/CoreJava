package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExceptions {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("data.txt");
            BufferedReader reader = new BufferedReader(file);
            System.out.println(reader.readLine());
            reader.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found!");
        }catch (IOException e){
            System.out.println("File reading fail");
        }
        System.out.println("Exception Handled");
    }
}
