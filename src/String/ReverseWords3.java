package String;

public class ReverseWords3 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords3(s));
    }
    public static String reverseWords3(String s){
        String[] str = s.split(" ");
        for(int i=0; i<str.length; i++){
            str[i] = new StringBuilder(str[i]).reverse().toString();

        }
        String sentence = String.join(" ", str);
        return sentence;
    }
}
