package Arrays.Hashing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums ={3,1,3};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        HashMap.Entry<Integer, Integer> max = Collections.max(map.entrySet(), Map.Entry.comparingByValue());
        return max.getKey();
    }

}
