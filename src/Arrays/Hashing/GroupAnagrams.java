package Arrays.Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] str = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams(str);
    }
    public static void groupAnagrams(String[] str){
        HashMap<String, List<String>> map = new HashMap<>();
            for(int i=0; i< str.length; i++){
                Arrays.sort(str[i].toCharArray());
                System.out.println(Arrays.toString(str));
            }

//        return null;
    }
}
