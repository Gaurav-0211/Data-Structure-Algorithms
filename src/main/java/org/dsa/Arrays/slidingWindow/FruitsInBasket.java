package org.dsa.Arrays.slidingWindow;

import java.util.HashMap;
import java.util.Map;

//Que: Given an array of characters where each character represents a fruit tree, you are given two baskets,
// and your goal is to put the maximum number of fruits in each basket.
// The only restriction is that each basket can have only one type of fruit.
public class FruitsInBasket {

    public static void basket(int[] arr){
        int left = 0;
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i< arr.length; i++){
            int val = arr[i];
            map.put(val, map.getOrDefault(val, 0)+1);

            while(map.size() > 2){
                int num = arr[left];
                map.put(num, map.get(num) - 1);

                if(map.get(num) == 0){
                    map.remove(num);
                }
                left++;
            }
            ans = Math.max(ans, i-left+1);
        }
        System.out.println("Maximum array fruits can come in basket is : "+ans);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 4, 1, 4};

        basket(arr);
    }
}
