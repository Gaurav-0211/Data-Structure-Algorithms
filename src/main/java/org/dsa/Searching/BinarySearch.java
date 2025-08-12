package org.dsa.Searching;

public class BinarySearch {
    public static int binarySearch(int[] arr,int target){
        int low =0;
        int high = arr.length - 1;
        while(low <= high){
            int mid  = (low + high) /2;
            if(arr[mid] == target){
                return mid;
            }else if(target > arr[mid]){
                low = mid +1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {12, 43, 78, 96, 106, 190, 234, 432};
        int ans = binarySearch(arr, 432);
        if(ans >=0){
            System.out.println("Element found at :"+ ans);
        }else{
            System.out.println("Element not found");

        }
    }
}
