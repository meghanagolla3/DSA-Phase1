package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1};
        int k = 100000;
        rotateArray(nums,2);
    }
    public static void reverse(int[] arr, int start, int end){
        int n= arr.length-1;
//        int start = k;
//        int end = n-1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
    public static void rotateArray(int[] arr, int k){
        int n= arr.length;
        k %= n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr, k,n-1);
    }
}
