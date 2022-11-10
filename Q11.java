package task1_rout;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();
        int num6 = sc.nextInt();
        int sumPos=0;
        int sumNeg=0;
        if(num1>0){
            sumPos+=num1;
        }else{
            sumNeg+=num1;
        }
        if(num2>0){
            sumPos+=num2;
        }else{
            sumNeg+=num2;
        }
        if(num3>0){
            sumPos+=num3;
        }else{
            sumNeg+=num3;
        }
        if(num4>0){
            sumPos+=num4;
        }else{
            sumNeg+=num4;
        }
        if(num5>0){
            sumPos+=num5;
        }else{
            sumNeg+=num5;
        }
        if(num6>0){
            sumPos+=num6;
        }else{
            sumNeg+=num6;
        }
        
        System.out.println("sumpositiv = "+sumPos);
        System.out.println("sumNeg = "+sumNeg);
    }

}
