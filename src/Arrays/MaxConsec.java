package Arrays;

public class MaxConsec {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 0, 1, 1, 0, 1,1,1};
        System.out.println(maxCon(nums));
    }
    public static int maxCon(int[] nums){
        int max =0;
        int max1=0;
        for(int i=0; i< nums.length; i++){
            if(nums[i] == 1){
                max++;
                if(max > max1){
                    max1 = max;
                }
            }else{
                max =0;
            }

        }
        return max1;
    }
}
