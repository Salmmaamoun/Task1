
package task1_rout;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        if(number>0){
            System.out.println("positive");
        }else if(number<0){
            System.out.println("negitive");
        }else{
            System.out.println("Zeros");
        }
    }
 
}
