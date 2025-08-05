package org.dsa.Searching;
import java.util.Scanner;

public class LinearSearch {

    static void display(int[] arr){
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    static void search(int [] arr, int k){
        boolean flag = false;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == k){
                System.out.println("Element found at index : "+i);
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("Element not found");
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array Size");
        int x = sc.nextInt();
        System.out.println("Enter Array Element");
        int[] arr = new int[x];
        for(int i =0; i< x; i++){
            arr[i] = sc.nextInt();
        }
        search(arr, 6);
    }
}
