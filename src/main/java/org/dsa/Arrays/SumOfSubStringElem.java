package org.dsa.Arrays;

// Getting a number and calculating the sum of it's substring
public class SumOfSubStringElem {

    // Method to find substring
    static void subStringSum(String num){
        int ans = 0;
        for(int i = 0; i<num.length(); i++){
            StringBuilder sb = new StringBuilder();
            for(int j = i; j< num.length(); j++){
                sb.append(num.charAt(i));
                // Converting a string to int
                ans += Integer.parseInt(sb.toString());
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        String num = "12345";
        subStringSum(num);
    }
}
