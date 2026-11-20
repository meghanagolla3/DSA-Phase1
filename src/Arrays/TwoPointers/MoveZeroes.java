package Arrays.TwoPointers;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = new int[]{4,2,4,0,0,3,0,5,1,0};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums){
        int left = 0;
        int right = 0;
        while(right < nums.length){
            if(nums[left] ==0 && nums[right] !=0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right++;
            }else if(nums[right] == 0 && nums[left] !=0){
                left = right;
                right++;
            }else{
//                left++;
                right++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
