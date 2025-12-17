package org.dsa.Arrays.slidingWindow;

import java.util.Map;
import java.util.HashMap;

public class StringSliding {
    // Longest substring without repeating characters
    public static int longestSubstringWithoutRepeating(String str){
        int left = 0;
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
            
            while(map.get(ch) > 1){
                char s = str.charAt(left);
                map.put(ch, map.get(s) - 1);
                
                if(map.get(s) == 0){
                    map.remove(s);
                }
                left++;
            }
            ans = Math.max(ans, i-left+1);
        }
        return ans;
    }

    // Longest Substring with K distinct characters
    public static int longestSubstringWithKDistinctCharacter(String str, int k){
        int left = 0;
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);

            while(map.size() > k){
                char s = str.charAt(left);
                map.put(ch, map.get(s) -1 );

                if(map.get(s) == 0){
                    map.remove(s);
                }
                left++;
            }
            ans = Math.max(ans, i-left+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "abcabcdabcabc";
        //System.out.println(longestSubstringWithoutRepeating(str));
        System.out.println(longestSubstringWithKDistinctCharacter(str, 3));
        
    }
}