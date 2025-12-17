package org.dsa.Arrays.slidingWindow;


public class ArraySliding {
    // Que to find maximum subarray sum of length k
    public static int subarraySum(int[] arr,int k){
        int left = 0;
        int sum  = 0;
        int ans  = 0;

        for(int i = 0; i< arr.length; i++){
            sum += arr[i];

            if(i >= k-1){
                if(sum > ans){
                    ans = sum;
                }
                sum -= arr[left];
                left++;
            }
        }
        return ans;
    }
    // Maximum subarray product of size k
    public static int subarrayProduct(int[] arr, int k){
        int left = 0;
        int ans = 0;
        int prod = 1;

        for(int i = 0; i< arr.length; i++){
            prod *= arr[i];

            if(i >= k-1){
                if(prod > ans){
                    ans = prod;
                }
                try{
                    prod /= arr[left];
                }catch(Exception e){
                    System.out.println("Got an exception "+e);
                }
                left++;
            }
        }
        return ans;
    }
    // maximum average of a subarray
    public static int maxAvgSubarray(int[] arr, int k){
        int left = 0;
        int ans = 0;
        int sum  = 0;

        for(int i = 0; i< arr.length; i++){
            sum += arr[i];

            if(i >= k-1){
                int val = sum / k;
                if(val > ans){
                    ans = val;
                }
                sum -= arr[left];
                left++;
            }
        }
        return ans;
    }
    // count all subarray of size k having sum < given sum(s)
    public static int countSubarray(int[] arr, int k, int s){
        int left =0;
        int ans = 0;
        int sum  = 0;

        for(int i = 0; i< arr.length; i++){
            sum += arr[i];
            if(i >= k-1){
                if(sum < s){
                    ans++;
                }
                sum -= arr[left];
                left++;
            }
        }
        return ans;
    }

    // small contiguous subarray whose sum is greater than given sum
    public static int smallContiguousSubarray(int[] arr, int s){
        int left = 0;
        int ans = Integer.MAX_VALUE;
        int sum = 0;

        for(int i = 0; i< arr.length; i++){
            sum += arr[i];
            if(sum >= s){
                if((i-left+1) < ans){
                    ans = i-left+1;
                }
            }
            while(sum > s){
                sum -= arr[left];
                left++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 10, 2, -6, -2, 10, -5, 7, 6, 2};
        //System.out.println(subarraySum(arr, 3));
        //System.out.println(subarrayProduct(arr, 3));
        //System.out.println(maxAvgSubarray(arr, 3));
        //System.out.println(countSubarray(arr, 3, 10));
        System.out.println(smallContiguousSubarray(arr,13));
    }
}
