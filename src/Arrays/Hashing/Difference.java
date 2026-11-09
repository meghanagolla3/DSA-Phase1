package Arrays.Hashing;

import java.util.HashMap;
import java.util.Hashtable;

public class Difference {
    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
        System.out.println(difference(s,t));
    }
    public static char difference(String s, String t){
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for(char ch : s.toCharArray()){
            hm1.put(ch, hm1.getOrDefault(ch,0)+1);
        }
        for(char ch : t.toCharArray()){
            hm2.put(ch, hm2.getOrDefault(ch,0)+1);
        }
        for(char ch : t.toCharArray()){
            if(!hm1.containsKey(ch) || hm1.get(ch)==0){
                return ch;
            }
            hm1.put(ch, hm1.get(ch)-1);
        }
        return ' ';
    }
}
