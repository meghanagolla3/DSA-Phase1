package BitManipulation;

import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countingBits(10)));
//        System.out.println(Arr);
    }
    public static int[] countingBits(int n){
        int[] res = new int[n+1];
        for(int i=0; i<=n; i++){
            int count =0;
            int num = i;
            while(num!=0){
                num= num & (num-1);
                count++;
            }
                res[i] = count;
        }
        return res;
    }
}
