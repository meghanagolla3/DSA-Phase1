package BitManipulation;

public class ConvertBits {
    public static void main(String[] args) {
        System.out.println(convertBits(3,4));
    }
    public static int convertBits(int start, int goal){
        int ans = start ^ goal;
        int count = 0;
        for(int i = 0 ; i < 32; i++){
            if((ans & (1 << i)) >=1){
                count += 1;
            }
        }
        return count;
    }
}
