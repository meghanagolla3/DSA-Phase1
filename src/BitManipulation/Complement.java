package BitManipulation;

public class Complement {
    public static void main(String[] args) {
        System.out.println("Result:"+ complement(16));
        System.out.println('"'+ "Result" + '"');
    }
     static int complement(int num){
        int pos = 0;
        int nums = num;
        while(num >0){
            num = num >> 1;
            pos++;
        }
//        System.out.println(pos);
        int mask = (1 << pos) -1;
        int res = (~nums) & mask;
        return res;

    }
}
