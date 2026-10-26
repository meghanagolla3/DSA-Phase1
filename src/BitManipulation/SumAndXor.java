package BitManipulation;

public class SumAndXor {
    public static void main(String[] args) {
        System.out.print(sumOrXor(15));
    }
    static int sumOrXor(int n){
        int unSetBits = 0;
        while(n>0){
            if((n & 1) == 0){
                unSetBits++;
            }
            n = n >> 1;
        }
        return 1<< unSetBits;
    }
}
