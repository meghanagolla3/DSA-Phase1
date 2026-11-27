package BitManipulation;

import java.util.HashMap;

public class KeyboardRow {
    public static void main(String[] args) {

    }
    public static void row(String[] s){
        HashMap<Integer,Character> h1 = new HashMap<>();
        HashMap<Integer,Character> h2 = new HashMap<>();
        HashMap<Integer,Character> h3 = new HashMap<>();
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";
        String[] row = {null};
        for(int i = 0; i< s1.length(); i++){
            h1.put(i, s1.charAt(i));
        }
        for(int i = 0; i< s2.length(); i++){
            h1.put(i, s2.charAt(i));
        }
        for(int i = 0; i< s3.length(); i++){
            h1.put(i, s3.charAt(i));
        }

        for(int i = 0; i< s.length; i++){
            String n = s[i];
            if()
        }


    }
}
