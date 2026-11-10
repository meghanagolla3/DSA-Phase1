package BitManipulation;

import java.util.HashSet;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {1,0,2,2};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums){
//        int res =0;
//        for(int i=0; i<nums.length; i++){
//            res ^= i^ nums[i];
//        }
//        res ^= nums.length;
//        return res;
        int res = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int i=1; i<=nums.length; i++){
            if(!set.contains(i)){
                res = i;
            }
        }
        return res;
    }
}
