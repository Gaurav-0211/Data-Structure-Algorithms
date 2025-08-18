package org.dsa.Arrays;

public class SumOfDiagonal {
    public static int sumOfDiagonal(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // Adding all the diagonal element
           sum += arr[i][i];
           sum += arr[i][arr.length-i-1];

           // Excluding repeat addition of the center element of odd length array
           if(arr.length % 2 == 1){
               sum -= arr[arr.length/2][arr.length/2];
           }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(sumOfDiagonal(arr));
    }
}
