package task1_rout;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char select;
        int num1;
        int num2;
        do {
            System.out.println("Enter 2 numbers: ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println("choose operation ");
            select = sc.next().charAt(0);
            switch (select) {
                case '+':
                    System.out.println("sum = " + sum(num1, num2));
                    break;
                case '-':
                    System.out.println("sub = " + sub(num1, num2));
                    break;
                case '*':
                    System.out.println("multi = " + multi(num1, num2));
                    break;
                case '/':
                    System.out.println("div = " + div(num1, num2));
                default:
                    System.out.println("not find");
                    System.exit(0);
            }

        } while (select != 0);
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {

        return num1 - num2;

    }

    public static int multi(int num1, int num2) {

        return num1 * num2;

    }

    public static int div(int num1, int num2) {
        if (check(num1, num2)) {
            return num1 - num2;
        }
        return 0;
    }

    public static boolean check(int num1, int num2) {
        if (num1 > num2) {
            return true;
        }
        return false;
    }

}
