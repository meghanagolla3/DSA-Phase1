package BitManipulation;

public class PowerOf2 {
    public static void main(String[] args) {
        System.out.print(powerOf2(16));
    }
    public static boolean powerOf2(int n){
        while(n>0){
            n = n & (n-1);
            if(n ==0){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

}
