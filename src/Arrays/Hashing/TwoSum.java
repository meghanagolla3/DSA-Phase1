package Arrays.Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,14};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int complement =0;
        for(int i=0; i< nums.length; i++){
            complement = target-nums[i];
            if(map.containsKey(complement)){
                return new int[] {
                    map.get(complement),i
                };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
