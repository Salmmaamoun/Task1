package task1_rout;

import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
           int temp;
        if (num2 < num1 && num2 <= num3) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        } else if (num3 < num1 && num3 < num2) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num3 < num2) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        
        System.out.println("max = "+num3);
        System.out.println("min = "+num1);
        
    }

    public static void max(int num1, int num2, int num3) {
     
    }
}
