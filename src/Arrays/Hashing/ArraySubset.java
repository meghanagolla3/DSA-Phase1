package Arrays.Hashing;

import java.util.Arrays;
import java.util.Hashtable;

public class ArraySubset {
    public static void main(String[] args) {
        int[] a = {11, 1, 13, 21, 3, 3};
        int[] b = {11, 3, 7, 1, 7};
        System.out.println(isSubset(a, b));
    }
    public static boolean isSubset(int[] a, int[] b) {
        // code here
        Hashtable<Integer, Integer> ht1 = new Hashtable<>(a.length);
        Hashtable<Integer, Integer> ht2 = new Hashtable<>(b.length);
        for(int i=0; i< a.length; i++){
            ht1.put(a[i], i);
        }

        for(int i=0; i< b.length; i++){
            ht2.put(b[i], i);
        }
        for(int i=0; i<ht2.size(); i++){
            for(int j=0; j< ht1.size(); j++){
                if(ht2.get(i).equals(ht1.get(j))){
                    return true;
                }
            }
        }
        return false;
    }
}
