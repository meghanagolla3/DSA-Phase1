package BitManipulation;

public class SingleNumber2 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,3,3,3};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums){
        int result = 0;
        for(int i=0; i< 32; i++){
            int count = 0;
            for(int num : nums){
                if(((num >> i) & 1) == 1){
                    count ++;
                }
            }
            if(count % 3 != 0){
                result |= (1 << i);
            }
        }
        return result;
    }
}
