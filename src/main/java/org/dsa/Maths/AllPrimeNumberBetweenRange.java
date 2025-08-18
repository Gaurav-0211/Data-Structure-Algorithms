package org.dsa.Maths;

public class AllPrimeNumberBetweenRange {
    // Method to get all prime number
    public static void allPrime(int a, int b){
        for(int i = a; i<=b; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    // Method that check number is prime or not
    static boolean isPrime(int x){
        for(int i = 2; i<= x/2; i++){
            if(x % i ==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // Variable to define range
        int a = 200;
        int b = 300;
        allPrime(a, b);
    }
}
