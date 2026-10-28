package BitManipulation;

public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(reverseBits(2147483644));
    }
    public static int reverseBits(int n){
        int res = 0;
//        int bit = 32;
        for(int i=0; i<32; i++){
            int bit = n & 1;
            res = (res << 1) | bit;
            n = n>>>1;
        }
        return res;
    }
}
