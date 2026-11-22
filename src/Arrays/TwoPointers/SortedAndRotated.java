package Arrays.TwoPointers;

public class SortedAndRotated {
    public static void main(String[] args) {
        int[] nums = new int[]{3,1, 5, 2};
        System.out.println(sortedAndRotated(nums));
    }
    public static boolean sortedAndRotated(int[] nums){
        int drop = 0;
        int n = nums.length;
        if(n <= 1) return true;
        for(int i=0; i<n; i++){
            if(nums[i] > nums[(i+1)%n]){
                drop++;
            }
        }
        return drop<=1;
    }
}
