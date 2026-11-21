package Arrays.TwoPointers;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums){
        int left =0;
        int right = 1;
//        int count = 1;
        while(right < nums.length){
            if(nums[left] != nums[right]){
                left++;
                nums[left] = nums[right];

            }
            right++;

        }
        return left+1;
    }
}
