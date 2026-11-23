package Arrays;

public class MinCost {
    public static void main(String[] args) {
        int[] arr ={4};
        System.out.println(minCost(arr));

    }
    public static int minCost(int [] arr){
        int min = Integer.MAX_VALUE;

        for (int i=0; i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        int n = arr.length;
        int cost =0;
        if(n==1) return 0;
        for (int i=0; i< n-1; i++){
            cost += min;
        }
        return cost;
    }
}
