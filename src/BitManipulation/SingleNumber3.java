package BitManipulation;

import java.util.Arrays;

public class SingleNumber3 {
    public static void main(String[] args) {
        int[] nums = {2,1,2,3,4,1};
        System.out.println(Arrays.toString(singleNumber(nums)));
    }
    public static int[] singleNumber(int[] nums){
        int xorr = 0;
        for(int i= 0; i < nums.length; i++){
            xorr = xorr ^ nums[i];
        }
        long rightmost = (xorr &(xorr-1)) ^ xorr;
        int b1 =0;
        int b2 =0;
        for(int i= 0; i < nums.length; i++){
            if(((nums[i] & rightmost)==0) ){
                b1= b1 ^ nums[i];
            }else{
                b2 ^= nums[i];
            }
        }
        return new int[]{b1, b2};
    }
}
