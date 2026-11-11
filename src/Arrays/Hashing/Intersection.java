package Arrays.Hashing;
import java.util.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Intersection {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2 ){
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashSet<Integer> map2 = new HashSet<>();
//        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums1.length; i++){
            map1.put(nums1[i],i);
        }
        for(int num:nums2){
            if(map1.containsKey(num)){
                map2.add(num);
            }
        }
        int[] arr = map2.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return arr;
    }
}
