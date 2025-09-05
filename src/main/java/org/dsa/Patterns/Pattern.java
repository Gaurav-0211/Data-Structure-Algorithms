package org.dsa.Patterns;
public class Pattern {

    // Triangle - Right angle triangle
    public static void pattern1(){
        int n = 6;
        for(int i = 1; i<= n; i++){
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Right angle Triangle - reverse
    public static void pattern2(){
        int n = 6;
        for(int i = n; i >= 1; i--){
            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Rectangle
    public static void pattern3(){
        int n = 6;
        for(int i = 1; i <= n;  i++){
            for(int j = 1; j<= n; j++){
                if(i == 1 || i == n || j==1 || j==n) {
                    System.out.print("*");
                }  else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Diamond
    public static void pattern4(){
        int n = 5;

        for(int i = 1; i<= n; i++){
            for(int j = i; j<n; j++){
                System.out.print(" ");
            }

            for(int j = 1; j<= (2 * i -1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n-1; i>= 1; i--){
            for(int j = i; j<n; j++){
                System.out.print(" ");
            }

            for(int j =1; j<= (2 * i - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern4();
    }
}
