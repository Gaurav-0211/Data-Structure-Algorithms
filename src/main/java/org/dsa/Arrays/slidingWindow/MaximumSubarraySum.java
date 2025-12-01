package org.dsa.Arrays.slidingWindow;

// Que: Find the maximum subarray sum of given array
public class MaximumSubarraySum {

    public static void subarraySum(int[] arr, int k){
        double total = 0;
        double ans = 0;
        int left = 0;
        for(int i = 0; i< arr.length; i++){
            total += arr[i];

            if(i >= k-1){
                ans = Math.max(ans, total);
                total -= arr[left];
                left++;
            }
        }
        System.out.println("Maximum subarray sum is : "+ans);
    }

    public static void main(String[] args) {
        int[] arr = {12, 43, -10, 6, 23, 11, 15, 17, -6, -55};

        subarraySum(arr, 4);
    }
}
