package Arrays.Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class Isomorphic {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isomorphic(s,t));
    }
    public static boolean isomorphic(String s, String t){
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i= 0; i< s.length() ; i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(map1.containsKey(ch1)){
                if(map1.get(ch1) != ch2){
                    return false;
                }
            }else{
                map1.put(ch1,ch2);
            }

            if(map2.containsKey(ch2)){
                if(map2.get(ch2) != ch1){
                    return false;
                }
            }else{
                map2.put(ch2, ch1);
            }
        }
        return true;
    }
}
