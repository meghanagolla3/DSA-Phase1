package Arrays.Hashing;

import java.util.HashMap;
import java.util.Objects;

public class RansomeNote {
    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "aab";
        System.out.println(ransomeNote(ransomNote,magazine));
    }
    public static boolean ransomeNote(String ransomNote, String magazine){
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for(char ch : magazine.toCharArray()){
            hm1.put(ch, hm1.getOrDefault(ch,0)+1);
        }
        for(char ch : ransomNote.toCharArray()){
            hm2.put(ch, hm2.getOrDefault(ch,0)+1);
        }
        for (char ch :ransomNote.toCharArray()){
            if(!hm1.containsKey(ch) || hm1.get(ch)==0){
                return false;
            }
            hm1.put(ch, hm1.get(ch)-1);
//            hm2.put(ch, hm2.get(ch)-1);
        }
        return true;
    }
}
