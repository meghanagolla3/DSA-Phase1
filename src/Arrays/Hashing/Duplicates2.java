package Arrays.Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Duplicates2 {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        System.out.println(duplicates(nums,1));
    }
    public static boolean duplicates(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< nums.length; i++){
            if(map.containsKey(nums[i])){
                if((Math.abs(map.get(nums[i]) - i)) <= k){
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
