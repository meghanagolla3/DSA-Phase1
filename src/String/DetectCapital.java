package String;

public class DetectCapital {
    public static void main(String[] args) {
        String s = "Flag";
        System.out.println(detectCapital(s));
    }
    public static boolean detectCapital(String s){
//        char[] ch = s.toCharArray();
        int i=0;
        while ( i<s.length()){
            int ascii = s.charAt(i);
            if(((ascii >= 65) && (ascii <=90)) || ((ascii >= 97) && (ascii <=122))){
                i++;
            }else if(((s.charAt(0) >= 65) && (s.charAt(0) <= 90)) ){
                if((ascii >= 97) && (ascii <=122)){
                    i++;
                }
            }else{
                return true;
            }
            return true;
        }
        return false;
    }
}
