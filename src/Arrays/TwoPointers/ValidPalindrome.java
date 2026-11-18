package Arrays.TwoPointers;

import java.util.Arrays;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(validPalindrome(s));
    }
    public static boolean validPalindrome(String s){
        String str = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        char[] ch = str.toCharArray();
        int left = 0;
        int right = ch.length-1;
        while(left < right){
            if(ch[left] == ch[right]){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
}
