package org.dsa.Maths;

import java.util.Scanner;
public class NumberFactorial {

    static void findSumFactorial(int num){
        int  temp = num;
        int ans = 0;
        while(temp > 0){
            int d = temp % 10;
            ans += factorial(d);
            temp /= 10;
        }

        if(ans == num){
            System.out.println("Number is equivalent: " + ans);
        }else{
            System.out.println("Number is not equivalent "+ans);
        }
    }

    static int factorial(int x){
        int val = 1;
        for(int i = 1; i<= x; i++){
            val *= i;
        }
        return val;
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();
        findSumFactorial(num);
    }

}
