package org.dsa.Arrays.slidingWindow;
// Que: Find the maximum average of k size subarray in the array.
public class MaxSubArrayAverage {
    // Solution Method
    public static void subarrayAverage(int[] arr, int k){
        double total = 0;
        int left = 0;
        double ans = -Double.MAX_VALUE;

        for(int i = 0; i< arr.length; i++){
            total += arr[i];

            if(i >= k-1){
                if((total/ k) > ans){
                    ans = total/k;
                }
                total -= arr[left];
                left++;
            }
        }
        System.out.println("Maximum average of subarray is : "+ ans); // Or return it
    }

    public static void main(String[] args) {
        int[] arr = {12, 32, -1, -5, 0, 26, 9, 11};

        subarrayAverage(arr, 3);
    }
}
