package BitManipulation;

public class MSB {
    public static void main(String[] args) {
        System.out.println(msb(10));
    }
    static int msb(int n){
        int msb = 0;
        while(n>1){
            msb=n;
            n= n&(n-1);
        }
        return msb;
    }
}
