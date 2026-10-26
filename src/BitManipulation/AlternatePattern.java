package BitManipulation;

public class AlternatePattern {
    public static void main(String[] args) {
        System.out.println(alternatePattern(5));
    }
    static boolean alternatePattern(int n){
        int x = n ^ (n>>1);
        return (x & (x+1))==0;
    }
}
