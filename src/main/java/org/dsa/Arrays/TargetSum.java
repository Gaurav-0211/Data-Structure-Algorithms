package org.dsa.Arrays;

// Two Pointers concept
public class TargetSum {

    public static int[] findTargetIndex(int[] arr, int target){
        int left = 0, right  = arr.length - 1;

        while(left < right){
            if(arr[left] + arr[right] == target){
                return new int[]{left, right};
            }
            else if(arr[left] + arr[right] < target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {7, 22, 34, 71, 80, 95, 100};
        int[] ans = findTargetIndex(arr, 122);
        for(int x : ans){
            System.out.println(x);
        }
    }
}
