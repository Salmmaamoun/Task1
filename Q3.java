package task1_rout;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alphabets = sc.next().charAt(0);
        switch (alphabets) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("Vowels");
                break;
            default:
                System.out.println("Consonant.");
        }
    }
}
