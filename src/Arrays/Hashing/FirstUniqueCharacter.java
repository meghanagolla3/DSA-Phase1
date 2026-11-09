package Arrays.Hashing;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqueCharacter(s));
    }
    public static int firstUniqueCharacter(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
//            if(map.get(ch)==1){
//                return map.get(ch);
//            }
//                break;
        }
        for(int i=0; i< s.length(); i++){
            char uni = s.charAt(i);
            if(map.get(uni) == 1) return i;
        }
        return -1;

    }
}
