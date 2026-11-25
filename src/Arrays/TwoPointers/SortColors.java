package Arrays.TwoPointers;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = new int[]{2,0,2,1,1,0};
        sortColors(nums);
    }
    public static void sortColors(int[] nums){
        int zeroes =0;
        int ones = 0;
        int twos = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i] == 0) zeroes++;
            else if(nums[i] ==1) ones++;
            else twos++;
        }
        for(int i=0; i< zeroes; i++){
            nums[i] =0;
        }
        for(int i=zeroes; i< ones+zeroes; i++){
            nums[i] = 1;
        }
        for(int i=zeroes+ones; i< ones+twos+zeroes; i++){
            nums[i] = 2;
        }
        System.out.println(Arrays.toString(nums));
    }
}
