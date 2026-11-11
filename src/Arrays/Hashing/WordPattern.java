package Arrays.Hashing;
import java.util.*;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat fish";
        System.out.println(wordPattern(pattern, s));

    }
    public static boolean wordPattern(String pattern, String s){
        String[] words = s.split(" ");
        if(pattern.length() != words.length){
            return false;
        }
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for(int i=0; i< pattern.length(); i++){
            char ch = pattern.charAt(i);
            String st = words[i];

            if(map1.containsKey(ch)){
                if(!Objects.equals(map1.get(ch), st)){
                    return  false;
                }
            }else{
                map1.put(ch,st);
            }

            if(map2.containsKey(st)){
                if(map2.get(st) != ch){
                    return false;
                }
            }else{
                map2.put(st, ch);
            }
        }
        return true;
    }
}
