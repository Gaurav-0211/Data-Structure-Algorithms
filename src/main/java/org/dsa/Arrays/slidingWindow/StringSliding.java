package org.dsa.Arrays.slidingWindow;

import java.util.*;

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
                map.put(s, map.get(s) - 1);
                
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
                map.put(s, map.get(s) -1 );

                if(map.get(s) == 0){
                    map.remove(s);
                }
                left++;
            }
            ans = Math.max(ans, i-left+1);
        }
        return ans;
    }

    // K size substring with distinct characters
    public static List<String> KSizeSubstringWithDistinct(String str, int k){
        int left = 0;
        List<String> ans = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);

            while((i - left + 1) > k || map.get(ch) > 1){
                char sh = str.charAt(left);
                map.put(sh, map.get(sh) - 1);

                if(map.get(ch) == 0){
                    map.remove(sh);
                }
                left++;
            }
            if ((i - left + 1) == k && map.size() == k) {
                ans.add(str.substring(left, i + 1));
            }
        }
        return ans;
    }

    public static void printList(List<String> ans){
        for(String s : ans){
            System.out.println(s);
        }
    }

    // Find all anagrams of pattern in a string
    public static List<Integer> allAnagramPatterns(String s, String p){
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) {
            return result;
        }

        int[] pFreq = new int[26];
        int[] windowFreq = new int[26];

        for (char c : p.toCharArray()) {
            pFreq[c - 'a']++;
        }

        int windowSize = p.length();

        for (int i = 0; i < s.length(); i++) {
            windowFreq[s.charAt(i) - 'a']++;
            if (i >= windowSize) {
                windowFreq[s.charAt(i - windowSize) - 'a']--;
            }

            if (Arrays.equals(pFreq, windowFreq)) {
                result.add(i - windowSize + 1);
            }
        }

        return result;
    }

    // Find all permutations for a given String
    public static List<Integer> findAllPermutations(String s, String p){

        List<Integer> result = new ArrayList<>();

        if (s == null || p == null || s.length() < p.length()) {
            return result;
        }
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : p.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        int windowStart = 0;
        int matched = 0;

        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char rightChar = s.charAt(windowEnd);

            if (freqMap.containsKey(rightChar)) {
                freqMap.put(rightChar, freqMap.get(rightChar) - 1);
                if (freqMap.get(rightChar) == 0) {
                    matched++;
                }
            }

            if (matched == freqMap.size()) {
                result.add(windowStart);
            }

            if (windowEnd >= p.length() - 1) {
                char leftChar = s.charAt(windowStart);
                windowStart++;

                if (freqMap.containsKey(leftChar)) {
                    if (freqMap.get(leftChar) == 0) {
                        matched--;
                    }
                    freqMap.put(leftChar, freqMap.get(leftChar) + 1);
                }
            }
        }

        return result;

    }

    public static void main(String[] args) {
        String str = "abcabcdabcabc";
        // System.out.println(longestSubstringWithoutRepeating(str));
        // System.out.println(longestSubstringWithKDistinctCharacter(str, 3));
        List<String> ans = KSizeSubstringWithDistinct(str, 3);
        printList(ans);
        
    }
}