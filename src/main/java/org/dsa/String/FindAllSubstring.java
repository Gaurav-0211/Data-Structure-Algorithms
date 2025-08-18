package org.dsa.String;

public class FindAllSubstring {
    // Method to get all substring
    public static void getAllSubstring(String str){
        // Outer loop run from 0 to string length
        for(int i = 0; i< str.length(); i++){
            // String Builder which stores and get all substring better than concatenation
            StringBuilder sb = new StringBuilder();
            // Inner loop run from current i to length
            for(int j = i; j< str.length(); j++){
                sb.append(str.charAt(j));
                // printing all substring from String Builder
                System.out.println(sb.toString());
            }
        }
    }
    public static void main(String[] args) {
        String str = "hello";
        getAllSubstring(str);
    }
}
