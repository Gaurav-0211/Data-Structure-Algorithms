package org.dsa.String;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterOfString {
    public static void countCharacter(String str){
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+"  "+ entry.getValue());
        }
    }
    public static void main(String[] args) {
        String str = "pqrspqrspqrsxyxy";
        countCharacter(str);
    }
}
