package OOPS;

import java.util.Scanner;

public class VariableInitialization {

    public static void display(int n){
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        display(n);
        System.out.println(n);
    }

}
