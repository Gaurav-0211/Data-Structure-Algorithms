package org.dsa.Arrays;

public class RotateArrayByK {
    public static void rotateByK(int[] arr, int k){
        int num = arr.length;
        int[] ans = new int[num];
        k = k % num;
        for(int i = 0; i<num; i++){
            if(i < k){
                ans[i] = arr[num+i-k];
            }else{
                ans[i] = arr[i-k];
            }
        }
        for(int x : ans){
            System.out.print(x+" ");
        }

    }
    // Move all zero to the end of array
    public static void moveToEnd(int[] arr){
        int[] ans = new int[arr.length];
        int k = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i]==1){
                ans[k++] = 1;
            }
        }
        for(int i = k; i< arr.length; i++){
            ans[k++] = 0;
        }
        for(int x : ans){
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 53, 17, 81, 55, 67};
        int[] arr1 = {1, 0, 0, 1, 1, 0, 1, 0};
        rotateByK(arr, 3);
        moveToEnd(arr1);
    }
}
