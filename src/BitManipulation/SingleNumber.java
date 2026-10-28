package BitManipulation;
import java.util.Arrays;

import java.io.*;
import java.util.*;

public class SingleNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        for(int i=0; i< n ; i++){
            System.out.print("Enter n[i]:");
            nums[i] = scanner.nextInt();
        }
//        scanner.close();
        System.out.print(singleNumber(nums));
    }
    public static int singleNumber(int[] nums){
        int res = 0;
        for(int i : nums){
            res ^= i;
        }
        return res;
    }
}

//public class SingleNumber {
//    public static void main(String[] args) {
//        int[] nums = {1,2,1,2};
//        System.out.println(singleNumber(nums));
//    }
//    public static int singleNumber(int[] nums) {
//        int res = 0;
//        for(int i : nums){
//            res ^= i;
//        }
//        return res;
//    }
//}
