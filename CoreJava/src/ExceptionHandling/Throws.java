package ExceptionHandling;

import java.io.*;

public class Throws {

    public static void fileMethod() throws Exception {
        FileReader file = new FileReader("data.txt");
        file.read();
        file.close();

    }

    public static void handleException(){
        try{
            fileMethod();
        }catch (Exception e){
            System.out.println("Exception handled");
        }
    }

    public static void main(String[] args) throws IOException {
        handleException();
        System.out.println("Running after exception found");
    }
}
