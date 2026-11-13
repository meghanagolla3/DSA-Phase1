package Arrays.Hashing;

import java.util.HashMap;

public class FourSum {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{-2, -1};
        int[] nums3 = new int[]{-1, 2};
        int[] nums4 = new int[]{0, 2};
        System.out.println(fourSum(nums1, nums2,nums3, nums4));

    }
    public static int fourSum(int[] nums1, int[] nums2, int[] nums3, int[] nums4){
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum =0;
        for(int a : nums1){
            for (int b : nums2){
                sum = a+b;
                map.put(sum, map.getOrDefault(sum,0)+1);
            }
        }
        int count =0;
        for (int c: nums3){
            for (int d : nums4){
                int target = -(c+d);
                count +=  map.getOrDefault(target,0);
            }
        }
        return count;
    }
}
