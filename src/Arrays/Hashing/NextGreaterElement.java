package Arrays.Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;


public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = {2,4};
        int[] nums2 = {1,2,3,4};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2){
//        Hashtable<Integer, Integer> ht = new Hashtable<>();
        int[] res = new int[nums1.length];
        for(int i=0; i< nums1.length; i++){
            res[i] = -1;
            for(int j=0; j< nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    for(int k = j+1; k < nums2.length; k++){
                        if(nums2[k] > nums1[i]){
                            res[i] = nums2[k];
                            break;
                        }
                    }
                break;
                }
            }
        }
        return res;
    }
}
