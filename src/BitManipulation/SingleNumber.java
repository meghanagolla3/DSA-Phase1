package BitManipulation;
import java.util.Arrays;


public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,1,2};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int res = 0;
        for(int i : nums){
            res ^= i;
        }
        return res;
    }
}
