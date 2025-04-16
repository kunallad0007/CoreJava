package IO;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.Scanner;
import java.util.logging.Logger;

class Student{
    private String studentName;
    private int studentAge;
    private String studentCourse;
    Scanner sc = new Scanner(System.in);

    public void setStudentName(){
        this.studentName = sc.nextLine();
    }
    public String getStudentName(){
        return studentName;
    }

    public void setStudentAge(){
        try{
            this.studentAge = sc.nextInt();
            sc.nextLine();
        }catch(Exception e){
            System.out.println("Invalid age input.");
            sc.nextLine();
        }
    }
    public int getStudentAge(){
        return studentAge;
    }

    public void setStudentCourse(){
        this.studentCourse = sc.nextLine();
    }

    public String getStudentCourse(){
        return studentCourse;
    }

    public Student(){

    }
    public void studentDetails(){
        System.out.print("Enter Name: ");
        setStudentName();

        System.out.print("Enter Age: ");
        setStudentAge();

        System.out.print("Enter Course: ");
        setStudentCourse();
    }
}

class Json{
    private final Student student;
    private static final Logger logger = Logger.getLogger(Json.class.getName());
    public Json(){
        this.student = new Student();
    }
    public void writeJson(){
        student.studentDetails();
        ObjectMapper mapper = new ObjectMapper();

        try{
            mapper.writeValue(new File("E:\\CoreJava\\CoreJava\\src\\IO\\student.json"), student);
            System.out.println("✅ JSON written to file successfully.");
        }catch(Exception e){
            logger.severe("Something went wrong: " + e.getMessage());
        }
    }

    public void readJson(){
        ObjectMapper mapper = new ObjectMapper();

        try{
            Student student = mapper.readValue(new File("E:\\CoreJava\\CoreJava\\src\\IO\\student.json"), Student.class);
            System.out.println("\n📄 Reading JSON:");
            System.out.println("Name: "+ student.getStudentName());
            System.out.println("Age: "+ student.getStudentAge());
            System.out.println("Course: "+ student.getStudentCourse());
        }catch (Exception e){
            logger.severe("Something went wrong: " + e.getMessage());
        }
    }

}


public class JacksonLibrary {
    public static void main(String[] args) {
        Json newJson = new Json();
        newJson.writeJson();
        newJson.readJson();
    }
}
