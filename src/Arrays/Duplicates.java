package Arrays;

import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(containDuplicates(nums));
    }
    public static boolean containDuplicates(int[] nums){
        int temp;
        for(int i =0; i< nums.length-1; i++){
            for(int j=0; j< nums.length-i-1; j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

//        int count = 0;
//        for(int i =0; i< nums.length; i++){
//            for(int j=i+1; j< nums.length; j++){
//                if(nums[i] == nums[j]){
//                    count++;
//                }
//            }
//        }
//        return count >0;
        Arrays.sort(nums);
        for(int i=1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }
}
