package Arrays;

public class MinOperations {
    public static void main(String[] args) {
        int[] arr = {4,2,6,8};
        System.out.println(minOp(arr,3));

    }
    public static int minOp(int[] arr, int k){
        int op = 0;
        int max = 0;
        int some = 0;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        for(int i=0; i< arr.length; i++){
            if(arr[i] < max){
                some = max - arr[i];
                if(some%k ==0){
                    op = op + (some/k);
                }else{
                    return -1;
                }
            }

        }
        return op;
    }
}
