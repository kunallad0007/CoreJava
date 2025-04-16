package IO;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.*;
import java.util.logging.Logger;

class Student{
    private String studentName;
    private int studentAge;
    private String studentCourse;
    Scanner sc = new Scanner(System.in);

    public void inputStudentDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        this.studentName = sc.nextLine();

        System.out.print("Enter Age: ");
        try{
            this.studentAge = sc.nextInt();
            sc.nextLine();
        }catch(Exception e){
            System.out.println("Invalid age input.");
            sc.nextLine();
        }

        System.out.print("Enter Course: ");
        this.studentCourse = sc.nextLine();
    }

    public String getStudentName(){
        return studentName;
    }
    public int getStudentAge(){
        return studentAge;
    }

    public String getStudentCourse(){
        return studentCourse;
    }

    public Student(){}

}

class JsonManager{
    private static final Logger logger = Logger.getLogger(JsonManager.class.getName());
    private final File file = new File("E:\\CoreJava\\CoreJava\\src\\IO\\students.json");
    private final ObjectMapper mapper = new ObjectMapper();

    public void writeStudentsToFile(List<Student> students){
        try{
            mapper.writerWithDefaultPrettyPrinter().writeValue(file, students);
            System.out.println("✅ Students saved to file.");
        }catch(Exception e){
            logger.severe("Error writing to file: " + e.getMessage());
        }
    }

    public List<Student> readStudentsFromFile(){
        try{
            if(file.exists()){
                return mapper.readValue(file, new TypeReference<List<Student>>() {
                });
            }
        }catch (Exception e){
            logger.severe("Error reading file: " + e.getMessage());
        }

        return new ArrayList<>();
    }

    public void addMultipleStudents(){
        Scanner sc = new Scanner(System.in);
        List<Student> exitingStudents = readStudentsFromFile();

        System.out.println("How many students do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of the student " + (i+1) + ".> ");
            Student newStudent = new Student();
            newStudent.inputStudentDetails();
            exitingStudents.add(newStudent);
        }
        writeStudentsToFile(exitingStudents);
    }

    public void updateStudentDetails() {
        System.out.println("updating method working");
    }

    public void deleteStudentDetails() {
        System.out.println("deleting method is working");
    }

}


public class JacksonLibrary {
    private static void crudOperation(String userInput) {
        JsonManager manager = new JsonManager();
        String[] userArray = userInput.split(" ");
        String[] approach = {"register","create","creating","add","adding","modify","update","updating","change","changing","delete","deleting","remove","removing","show","see","view","check","read","reading","retrieve","retrieving","fetch","fetching","no","not","nothing", "exit"};

//        boolean found = false;
        String choice;
        for (String sys: approach){
            for(String user: userArray){
                if (Objects.equals(user, sys)) {
//                    found = true;
                    choice = user;
                    switch (choice){
                        case "register":
                        case "creating":
                        case "create":
                        case "adding":
                        case "add":
                            manager.addMultipleStudents();
                            break;
                        case "modify":
                        case "update":
                        case "updating":
                        case "change":
                        case "changing":
                            manager.updateStudentDetails();
                            break;
                        case "delete":
                        case "deleting":
                        case "remove":
                        case "removing":
                            manager.deleteStudentDetails();
                            break;
                        case "show":
                        case "see":
                        case "check":
                        case "view":
                        case "read":
                        case "reading":
                        case "retrieve":
                        case "retrieving":
                        case "fetch":
                        case "fetching":
                            System.out.println("\nHere are your student details: ");
                            manager.readStudentsFromFile().forEach(student -> {
                                System.out.println("Name: " + student.getStudentName());
                                System.out.println("Age: " + student.getStudentAge());
                                System.out.println("Course: " + student.getStudentCourse());
                                System.out.println("-----------------------------");
                            });
                            break;
                        case "no":
                        case "not":
                        case "nothing":
                        case "exit":
                            System.out.println("Bye... See you later");
                            break;
                        default:
                            System.out.println("Sorry i didn't understand, try again");
                            break;
                    }
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("!!Welcome to Student Portal!!");
        //Dynamic Approach
        System.out.print("How can I help you today: ");
        String userInput = sc.nextLine().toLowerCase();
        crudOperation(userInput);

    }
}
