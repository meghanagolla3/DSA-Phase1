package Math;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = -120;
        System.out.println(reverseInteger(x));
    }
    public static int reverseInteger(int x){
        int sum =0;
        while(x !=0){
            int r = x %10;
        if(sum > Integer.MAX_VALUE/10 || sum < Integer.MIN_VALUE/10){
            return 0;
        }
            sum = (sum*10) + r;
            x = x/10;
        }
        return sum;
    }
}
