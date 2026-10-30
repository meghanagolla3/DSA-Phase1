package BitManipulation;

public class Complement {
    public static void main(String[] args) {
        System.out.println(complement(1));
    }
    public static int complement(int num){
        int bits = 3;
        int mask = (1 << bits) -1;
        int res = (~num) & mask;
        return res;

    }
}
