package Arrays.Hashing;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        System.out.println(anagram(s,t));
    }
    public static boolean anagram(String s, String t){
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        int i=0;
        while(chars.length == chars1.length){
            if(chars[i] != chars1[i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
