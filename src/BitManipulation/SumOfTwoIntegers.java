package BitManipulation;

public class SumOfTwoIntegers {
    public static void main(String[] args) {
        System.out.println(sumOfTowIntegers(5,3));
    }
    public static int sumOfTowIntegers(int a, int b){
        while(b != 0){
            int sum = a^b;
            int carry = (a&b) <<1;

            a = sum;
            b = carry;
        }
        return a;

    }
}
