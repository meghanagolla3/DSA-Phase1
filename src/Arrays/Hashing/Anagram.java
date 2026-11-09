package Arrays.Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String s = "rac";
        String t = "car";
        System.out.println(anagram(s,t));
    }
    public static boolean anagram(String s, String t){
//        char[] chars = s.toCharArray();
//        char[] chars1 = t.toCharArray();
//        Arrays.sort(chars);
//        Arrays.sort(chars1);
//        int i=0;
//        while(chars.length == chars1.length){
//            if(chars[i] != chars1[i]){
//                return false;
//            }
//            i++;
//        }
//        return true;
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> hm1 = new HashMap<>();
        for(char ch : s.toCharArray()){
            hm1.put(ch, hm1.getOrDefault(ch, 0)+1);
        }
        for(char ch : t.toCharArray()){
            if(!hm1.containsKey(ch) || hm1.get(ch) ==0){
                return false;
            }
            hm1.put(ch,hm1.get(ch)-1);
        }
        return true;
    }
}
