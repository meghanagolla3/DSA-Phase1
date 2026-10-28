package BitManipulation;

public class NumberOfSetBits {
    public static void main(String[] args) {
        System.out.println(numberOfSetBits(128));
    }
    public static int numberOfSetBits(int n){
        int count = 0;
        while(n > 0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
}
