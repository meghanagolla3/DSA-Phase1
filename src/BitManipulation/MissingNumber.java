package BitManipulation;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {1,0};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums){
        int res =0;
        for(int i=0; i<nums.length; i++){
            res ^= i^ nums[i];
        }
        res ^= nums.length;
        return res;
    }
}
