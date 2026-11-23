package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Leaders {
    public static void main(String[] args) {
        int[] arr ={61, 61, 17};
        System.out.println(leader(arr));
    }
    public static ArrayList<Integer> leader(int[] arr){
        ArrayList<Integer> arr1 = new ArrayList<>();
//        arr1.add(0, arr[arr.length-1]);
        int l=0;
//        if(arr.length ==2) return arr1;
        for(int i=arr.length-1; i>=0; i--){
            if(l <= arr[i]){
                l= arr[i];
                arr1.add(arr[i]);
            }
        }
        Collections.reverse(arr1);
        return arr1;
    }
}
