package task1_rout;

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade = sc.next().charAt(0);
        switch (grade) {
            case 'A':
                System.out.println("marks >=80");
                break;
            case 'B':
                System.out.println("marks >=60 and less than 80");
                break;
            case'C':
                System.out.println("marks >=40 and less than 60");
                break;
            case 'F':
                System.out.println("marks <=40");
                break;
            default:
                System.out.println("invalid");
        }
    }

}
