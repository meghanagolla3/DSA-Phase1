
package Arrays.Hashing;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class DisappearedNumbers {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        System.out.println(disappearedArray(nums));
    }

    public static List<Integer> disappearedArray(int[] nums) {

        Hashtable<Integer, Integer> ht1 = new Hashtable<>();
        List<Integer> result = new ArrayList<>();

        // Step 1: Initialize numbers from 1 to n
        for (int i = 1; i <= nums.length; i++) {
            ht1.put(i, 0);
        }

        // Step 2: Mark the numbers present in the array
        for (int i = 0; i < nums.length; i++) {
            ht1.put(nums[i], 1);
        }

        // Step 3: Find numbers that are still marked 0
        for (int i = 1; i <= nums.length; i++) {
            if (ht1.get(i) == 0) {
                result.add(i);
            }
        }

        return result;
    }
}
