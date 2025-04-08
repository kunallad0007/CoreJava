package Programs;

import java.util.Scanner;

public class PowerRaiseTo {

    public static int powerMethod(int n, int m){
        int ans = 1;
        for(int i = 0; i < m; i++){
            ans *= n;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Enter raised to the power value: ");
        int m = sc.nextInt();
        System.out.println(n + " raised to the power " + m + " = " + powerMethod(n, m));

    }
}